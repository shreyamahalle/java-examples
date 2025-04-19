package com.shreya.practice.strings.stringBuilderClass;

public class StringBuilderClassAllMethods {
    public static void main(String[] args) {
        System.out.println("-------------append()method-----------------");
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" java");
        System.out.println(stringBuilder);

        System.out.println("-------------insert()method-----------------");
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        stringBuilder1.insert(1,"java");
        System.out.println(stringBuilder1);

        System.out.println("-------------replace()method-----------------");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        stringBuilder2.replace(1,2,"java");
        System.out.println(stringBuilder2);

        System.out.println("-------------delete()method-----------------");
        StringBuilder stringBuilder3 = new StringBuilder("Hello");
        stringBuilder3.delete(1,2);
        System.out.println(stringBuilder3);

        System.out.println("-------------reverse()method-----------------");
        StringBuilder stringBuilder4 = new StringBuilder("Hello");
        stringBuilder4.reverse();
        System.out.println(stringBuilder4);

        System.out.println("-------------capacity()method-----------------");
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append("hello");
        System.out.println(stringBuilder5.capacity());

        System.out.println("-------------ensureCapacity()method-----------------");
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder5.ensureCapacity(10);
        System.out.println(stringBuilder6.capacity());


    }
}
