package src.com.shreya.constructor;

public class Shape {

    private int radius;
    private static  String type;

    //parameterized constructor
    public Shape(int radius){
        this.radius = radius;
        System.out.println("Shape parameterized constructor initialized");
    }
    //no parameterized constructor
    public Shape(){
        System.out.println("Shape default constructor");
    }

    public void print(){
        System.out.println("Radius of this shape is " + radius + " and shape is " + type);
    }

    public static void main(String[] args) {
        Shape.type = "circle";

        Shape circle1 = new Shape();
        circle1.radius = 5;
        circle1.print();

        Shape circle2 = new Shape(7);
        circle2.print();

        Shape circle3 = new Shape(9);
        circle3.print();
    }
}
