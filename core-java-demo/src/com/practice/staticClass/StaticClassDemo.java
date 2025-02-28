package src.com.practice.staticClass;

public class StaticClassDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.state = "Maharashtra";
        inner.country = "India";
        inner.printData();
    }
}
