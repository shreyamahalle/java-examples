package src.com.shreya.staticimport;
import static src.com.shreya.staticimport.service.HelloService.sayHello;

public class StaticImport {
    public static void main(String[] args) {
        sayHello("Shreya");
        sayHello("shreya", "amt");
    }
}
