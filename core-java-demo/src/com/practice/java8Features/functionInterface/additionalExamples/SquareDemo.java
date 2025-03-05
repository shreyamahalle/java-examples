package src.com.practice.java8Features.functionInterface.additionalExamples;

public class SquareDemo {
    public static void main(String[] args) {
        Square square = (no) -> no * no;
        System.out.println("Square of 4 is " +  square.calculate(4));
    }
}
interface Square{
    int calculate(int x);
}
