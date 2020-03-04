package com.example.cloud.service.service.employee;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.cloud.common.bean.Employee;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

public interface IEmployeeService {

    IPage<Employee> queryEmpByName(String name, String current, String size);

    void saveEmployee(Employee employee);

    void deleteEmployee(String empNo, String empName, String identityCard);

    void editEmployee(Employee employee);

    Workbook downloadEmpTemplate() throws Exception;

    Object exportEmpList(MultipartFile multipartFile) throws Exception;
}
