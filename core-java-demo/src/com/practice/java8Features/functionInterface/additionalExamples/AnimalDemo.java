package src.com.practice.java8Features.functionInterface.additionalExamples;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = (name) -> System.out.println("dog name is  " + name );
        dog.dogName("tom");
    }
}
interface Dog{
    void dogName(String name);
}
