package src.com.shreya.staticimport.service;

public class HelloService {
    public static void sayHello(String name){
        System.out.println("Hello " + (name.isEmpty()? "world ": name +  "!!" ));
    }
//    public static void sayHello(String...name){
//        for (String name: name){
//            System.out.println("Hello " + name);
//        }
    }

