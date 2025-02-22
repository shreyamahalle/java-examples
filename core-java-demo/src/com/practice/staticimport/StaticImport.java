package src.com.practice.staticimport;
import static src.com.practice.staticimport.service.HelloService.sayHello;

public class StaticImport {
    public static void main(String[] args) {
        sayHello("Shreya");
        //sayHello("shreya", "amt");
    }
}
