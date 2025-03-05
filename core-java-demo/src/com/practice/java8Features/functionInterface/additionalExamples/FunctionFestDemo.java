package src.com.practice.java8Features.functionInterface.additionalExamples;

public class FunctionFestDemo {
    public static void main(String[] args) {
        Lighting lighting = (color) -> System.out.println("Light color is " + color);
        lighting.ligh("blue");

        Decoration decoration = (worm) -> System.out.println("Decoration for festival is worm " + worm );
        decoration.decorationFest("Haldi");

    }
}
interface Lighting{
    void ligh(String name);
}

interface Decoration{
    void decorationFest(String decoration);
}
