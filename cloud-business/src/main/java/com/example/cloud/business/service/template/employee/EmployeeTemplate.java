package com.example.cloud.business.service.template.employee;


import com.example.cloud.common.annotation.ExcelAnnotation;

public class EmployeeTemplate {

    //人员名称
    @ExcelAnnotation(column = 0,name="姓名",width = 200)
    private String empName;

    //年龄
    @ExcelAnnotation(column = 1,name="年龄",width = 200)
    private String age;

    //身份证号码
    @ExcelAnnotation(column = 2,name="身份证号码",width = 200)
    private String identityCard;

    //居住地址
    @ExcelAnnotation(column = 3,name="居住地址",width = 200)
    private String liveAddress;

    //户籍所在地
    @ExcelAnnotation(column = 4,name="户籍所在地",width = 200)
    private String familyAddress;

    //联系电话
    @ExcelAnnotation(column = 4,name="联系电话",width = 200)
    private String phone;

    //邮箱
    @ExcelAnnotation(column = 5,name="邮箱",width = 200)
    private String email;

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
