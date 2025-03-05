package src.com.practice.java8Features.functionInterface.additionalExamples;

public class GreetingsExample {
    public static void main(String[] args) {
        Greetings greetings = () -> System.out.println("Hello ");
        greetings.sayHello();
    }
}

interface Greetings{
    void sayHello();
}
