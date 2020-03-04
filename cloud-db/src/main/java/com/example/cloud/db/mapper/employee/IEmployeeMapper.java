package com.example.cloud.db.mapper.employee;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cloud.common.bean.Employee;
import com.example.cloud.db.po.employee.EmployeePO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IEmployeeMapper extends BaseMapper<EmployeePO> {

    @DS("MYSQL_DB")
    IPage<Employee> queryEmployeeByName(Page<?> page, @Param("empName") String empName);

    @DS("MYSQL_DB")
    void saveEmployee(EmployeePO employeePO);

    @DS("MYSQL_DB")
    void deleteEmployee(@Param("empNo") String empNo);

    @DS("MYSQL_DB")
    List<EmployeePO> queryEmpByCardOrPhone(@Param("identityCard") String identityCard,@Param("phone") String phone);

    @DS("MYSQL_DB")
    void editEmployee(EmployeePO employeePO);
}
