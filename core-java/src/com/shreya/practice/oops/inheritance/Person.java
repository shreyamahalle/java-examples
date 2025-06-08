package com.shreya.practice.oops.inheritance;

public class Person {
    String name;
    String address;
    String mobileNo;
    public void show(){
        System.out.println("Person Information: " + " name " + name + " address " + address + " mobileNo " + mobileNo);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "BCD";
        employee.address = "Pune";
        employee.mobileNo = "8054786532";
        employee.empId = "101S";
        employee.companyName = "ABC";

        employee.show();

    }
}

class Employee extends Person{
    String empId;
    String companyName;
    @Override
    public void show(){
        super.show();
        System.out.println("Employee Information: " + " empId " + empId + " companyName " + companyName);
    }
}
