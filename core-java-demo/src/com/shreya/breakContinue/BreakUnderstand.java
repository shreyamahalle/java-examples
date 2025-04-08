package src.com.shreya.breakContinue;

import java.util.ArrayList;
import java.util.List;

public class BreakUnderstand {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kivi");
        for (String item : fruits){
            if (item.equals("stop")){
                System.out.println("breaking " + item);
                break;
            }
            System.out.println(item);
        }
    }
}
