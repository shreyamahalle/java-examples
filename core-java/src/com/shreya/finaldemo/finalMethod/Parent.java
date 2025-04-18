package src.com.shreya.finaldemo.finalMethod;

public class Parent {
    final void show() {
        System.out.println("this is final method");
    }
        class Child extends Parent{
         //void show(); // Error: Cannot override the final method
       }
}
