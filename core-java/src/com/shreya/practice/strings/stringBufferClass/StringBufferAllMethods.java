package com.shreya.practice.strings.stringBufferClass;

public class StringBufferAllMethods {

    public static void main(String[] args) {

        System.out.println("-----------------append()Method----------------");
        StringBuffer sb = new StringBuffer("hello ");
        //sb.append("java");
        System.out.println(sb);

        System.out.println("-----------------insert()Method----------------");
        sb.insert(1,"java ");
        System.out.println(sb);

        System.out.println("-----------------replace()Method----------------");
        sb.replace(1,4,"java");
        System.out.println(sb);

        System.out.println("-----------------delete()Method----------------");
        sb.delete(1,3);
        System.out.println(sb);

        System.out.println("-----------------reverse()Method----------------");
        StringBuffer s1 = new StringBuffer("String");
        s1.reverse();
        System.out.println(s1);

        System.out.println("-----------------capacity()Method----------------");
        StringBuffer s2 = new StringBuffer();
        System.out.println(s2.capacity());

        s2.append("Hello");
        System.out.println(s2.capacity());

        s2.append("Java is my favourite language");
        System.out.println(s2.capacity());

        System.out.println("-----------------ensureCapacity()Method----------------");
        s2.ensureCapacity(10);
        System.out.println(s2.capacity());



    }
}
