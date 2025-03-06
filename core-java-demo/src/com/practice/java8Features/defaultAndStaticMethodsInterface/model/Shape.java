package src.com.practice.java8Features.defaultAndStaticMethodsInterface.model;

public interface Shape {
    void draw();

    default void print() {
        System.out.println("base printing done");
    }
    static void erase(){
        System.out.println("base shape has been erased.");
        }
    }

