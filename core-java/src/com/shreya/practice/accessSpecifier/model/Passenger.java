package com.shreya.practice.accessSpecifier.model;

public class Passenger {

    public String name;
    public float luggageSize;
    protected int ticketPrice;
    String gender;
    private String address;
    private int age;

    public float getLuggageSize() {
        return luggageSize;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", luggageSize=" + luggageSize +
                '}';
    }
}

