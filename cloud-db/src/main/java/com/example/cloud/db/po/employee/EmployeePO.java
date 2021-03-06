package com.example.cloud.db.po.employee;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.cloud.service.base.po.BasePO;

/***
 *人员信息PO
 */
@TableName(value = "t_emp_info")
public class EmployeePO extends BasePO{

    //人员编号
    private String empNo;

    //人员名称
    private String empName;

    //年龄
    private String age;

    //身份证号码
    private String identityCard;

    //居住地址
    private String liveAddress;

    //户籍所下地
    private String familyAddress;

    //联系电话
    private String phone;

    //邮箱
    private String email;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
