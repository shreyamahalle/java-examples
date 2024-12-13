package com.operators.accessSpecifier;

import com.operators.accessSpecifier.defaultspecifier.model.City;
import com.operators.accessSpecifier.privatespecifier.model.Vehicle;
import com.operators.accessSpecifier.protectedspecifier.model.Building;
import com.operators.accessSpecifier.publicspecifier.model.Student;

public class SpecifierDemo {
    public static void main(String[] args) {
        SpecifierDemo sp = new SpecifierDemo();
        sp.publicSpecifierDemo();

        sp.privateSpecifierDemo();

        sp.protectedSpecifierDemo();

        sp.defaultSpecifierDemo();

    }

    void publicSpecifierDemo() {
        Student s = new Student();
        s.id = 1;
        s.city = "pune";
        s.name = "ABC";

        System.out.println("student = " + s);
    }

    void privateSpecifierDemo() {
        Vehicle v = new Vehicle();
        v.setId(1);
        v.setMake("BMW");
        v.setModel("xb");
        System.out.println("Vehicle = " + v);
    }

    void protectedSpecifierDemo() {
        Building b1 = new Building();
        b1.setId(3);
        b1.setCity("mumbai");
        b1.setName("sai");
        System.out.println("Building " + b1);
    }

    void defaultSpecifierDemo() {
        City c = new City();
        c.setId(11);
        c.setName("bbb");
        c.setState("maharashtra");
        c.setPincode(23456);
        System.out.println("city" + c);

    }
}