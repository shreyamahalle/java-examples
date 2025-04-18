package com.shreya.practice.java8Features.streamApi;

public class Product {
    int id;
    String name;
    float price;

    Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Float price() {
        return 0f;
    }

    public Integer id() {
        return 0;
    }
}

//record Product(int id,String name,float price){
//
//}
