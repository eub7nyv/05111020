package com.example.springboot.vo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListVO {

    private List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

    public List<EmployeeVO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeVO> employees) {
        this.employees = employees;
    }
}
