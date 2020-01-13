package com.example.cloud.db.mapper.employee;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloud.db.po.employee.EmployeePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEmployeeMapper extends BaseMapper<EmployeePO> {

    @DS("MYSQL_DB")
    List<EmployeePO> queryEmployeeByName( String empName);
}
