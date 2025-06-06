package com.shreya.practice.java5Features.staticimport.mode;

import static com.shreya.practice.java5Features.staticimport.mode.CityDetails.city;

public class StaticImportDemo {
    public static void main(String[] args) {
        city = "Pune";
        System.out.println("city " + city);
    }
}
