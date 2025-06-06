package com.shreya.practice.oops.inheritance.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Person {
    private int empid;
    private String dept;
    private int salary;

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
