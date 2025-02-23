package src.com.practice.oops.inheritance.service;

public class ShapeDemo {
    public static void main(String[] args) {
        BaseShape baseShape = new BaseShape();
        baseShape.draw();
        System.out.println("------------------------------");

        baseShape = new Circle();
        baseShape.draw();

    }
}
