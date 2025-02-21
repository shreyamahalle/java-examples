package src.com.practice.staticimport.service;

public class HelloService {
    public static void sayHello(String name){
        System.out.println("Hello " + (name.isEmpty()? "world ": name +  "!!" ));
    }
}
