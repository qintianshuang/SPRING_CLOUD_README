package com.example.cloud.business.service.employee.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cloud.business.service.template.employee.EmployeeTemplate;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.common.config.Logger;
import com.example.cloud.common.exception.BusinessException;
import com.example.cloud.common.exception.CommonErrorCode;
import com.example.cloud.common.util.PoiUtils;
import com.example.cloud.common.util.RoleUtil;
import com.example.cloud.db.dao.employee.IEmployeeDao;
import com.example.cloud.service.service.employee.IEmployeeService;
import com.example.cloud.service.util.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service(value = "empService")
public class EmployeeServiceImpl implements IEmployeeService {

    private final static Logger LOG = Logger.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    @Qualifier(value = "employeeDao")
    private IEmployeeDao employeeDao;

    /***
     *
     * @return
     */
    @Override
    public IPage<Employee> queryEmpByName(String empName, String current, String size) {
        Page<Employee> page = new Page<>();
        page.setCurrent(Long.parseLong(current));
        page.setSize(Long.parseLong(size));
        IPage<Employee> employeeList = employeeDao.queryEmpByName(page,empName);
        LOG.info("employeeList=【" + JSONObject.toJSONString(employeeList) + "】");
        return employeeList;
    }

    /***
     *
     * @return
     */
    public List<Employee> queryEmpByCardOrPhone(String identityCard, String phone) {
        if (StringUtils.isBlank(identityCard) && StringUtils.isBlank(phone)) {
            return null;
        }
        List<Employee> employeeList = employeeDao.queryEmpByCardOrPhone(identityCard, phone);
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        if (employee == null) {
            return;
        }
        if (StringUtils.isBlank(employee.getEmpName())) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "用户名不能为空！");
        }
        char[] chars = employee.getIdentityCard().toCharArray();
        if (chars.length != 18) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "请正确录入18位有效身份证号码！");
        }
        boolean email = RoleUtil.isEmail(employee.getEmail());
        if (!email) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "请正确录入邮箱！");
        }
        List<Employee> employees = queryEmpByCardOrPhone(employee.getIdentityCard(), employee.getPhone());
        if (!CollectionUtils.isEmpty(employees)) {
            for (Employee employee1 : employees) {
                if (employee1.getIdentityCard().equals(employee.getIdentityCard())) {
                    throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "用户身份证信息已存在，请勿重复录入！");
                }
                if (employee1.getPhone().equals(employee.getPhone())) {
                    throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "用户电话信息已被注册，请确定电话号码是否准确！");
                }
            }
        }
        String uuid = UUID.randomUUID().toString().replace("-", "");
        employee.setEmpNo(uuid);
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(String empNo, String empName, String identityCard) {
        employeeDao.deleteEmployee(empNo);
    }

    @Override
    public void editEmployee(Employee employee) {
        if (employee == null) {
            return;
        }
        if (StringUtils.isBlank(employee.getEmpName())) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "用户名不能为空！");
        }
        char[] chars = employee.getIdentityCard().toCharArray();
        if (chars.length != 18) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "请正确录入18位有效身份证号码！");
        }
        boolean email = RoleUtil.isEmail(employee.getEmail());
        if (!email) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "请正确录入邮箱！");
        }
        employeeDao.editEmployee(employee);
    }

    @Override
    public Workbook downloadEmpTemplate() throws Exception {
        final String sheetName = "人员表";
        Workbook workbook = PoiUtils.exportExcel(EmployeeTemplate.class, sheetName, null);
        return workbook;
    }

    @Override
    public List<EmployeeTemplate> exportEmpList(MultipartFile multipartFile) throws Exception {
        if(multipartFile == null){
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getCode(), "请正确上传文件！");
        }
        String sheetName ="人员表";
        List<EmployeeTemplate> employeeTemplates = PoiUtils.readExcel(multipartFile, EmployeeTemplate.class, sheetName);
        return employeeTemplates;
    }
}
