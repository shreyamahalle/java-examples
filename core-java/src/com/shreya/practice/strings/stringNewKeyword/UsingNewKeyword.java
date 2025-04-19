package com.shreya.practice.strings.stringNewKeyword;

public class UsingNewKeyword {
    public static void main(String[] args) {
        String name = new String("Welcome");
        name=name.concat(" pune "); //immutable string

        System.out.println(name);

    }
}
