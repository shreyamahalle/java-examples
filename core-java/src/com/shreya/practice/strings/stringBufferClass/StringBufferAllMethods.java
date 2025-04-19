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





    }
}
