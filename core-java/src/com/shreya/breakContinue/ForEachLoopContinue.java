package src.com.shreya.breakContinue;
import java.util.ArrayList;
import java.util.List;

//continue statement examples for each loop
public class ForEachLoopContinue {
    public static void main(String[] args) {
        List<Integer> no = new ArrayList<>();
        no.add(2);
        no.add(5);
        no.add(5);
        no.add(1);
        no.add(101);
        for (Integer number : no){
            if (number.equals(5)){
                continue;
            }
            System.out.println(number);
        }
    }
}
