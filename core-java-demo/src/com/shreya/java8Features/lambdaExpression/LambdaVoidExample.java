package src.com.shreya.java8Features.lambdaExpression;

public class LambdaVoidExample {

    public static void main(String[] args) {

//        PrintFunctionImpl printFunction = new PrintFunctionImpl();
//        printFunction.print(10);

        PrintFunction printFunction = (int value) -> System.out.println("received value is: " + value);

        printFunction.print(50000);
    }
}
