package com.scheme.practice.model;

public class Address {
   public String houseNoBuildingName;
   public String landmark;
   public String city;
   public String tehsil;
   public String district;
   public String state;

   @Override
   public String toString() {
      return "Address{" +
              "houseNoBuildingName='" + houseNoBuildingName + '\'' +
              ", landmark='" + landmark + '\'' +
              ", city='" + city + '\'' +
              ", tehsil='" + tehsil + '\'' +
              ", district='" + district + '\'' +
              ", state='" + state + '\'' +
              ", pin=" + pin +
              '}';
   }

   public int pin;
}
