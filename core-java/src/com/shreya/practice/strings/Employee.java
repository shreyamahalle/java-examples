package com.shreya.practice.strings;

//example to create immutable class //immutable means once we create we can not change
public final class Employee {

    final String panCardNo;

    public Employee(String panCardNo) {
        this.panCardNo = panCardNo;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("PCV54");

    }

    public String getPanCardNo() {
        return panCardNo;
    }
}
