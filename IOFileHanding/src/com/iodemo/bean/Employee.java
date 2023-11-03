package com.iodemo.bean;

import java.io.Serializable;

public class Employee implements Serializable 
{
       private int empId;
       private  String empName;       //transient ye sabhi valu ko null kar dega jis bhi variable ke sath use kar rahe hai us ke

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + '}';
    }
    
    
       
       
       
}
