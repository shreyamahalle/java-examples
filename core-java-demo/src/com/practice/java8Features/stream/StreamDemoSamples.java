package src.com.practice.java8Features.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamDemoSamples {
    public static void main(String[] args) {

        //collection improvements
        //old fashion code
        List<String> oldMsg = new ArrayList<>();
        oldMsg.add("hi");
        oldMsg.add("Hello");
        oldMsg.add("how");
        oldMsg.add("are");
        oldMsg.add("you");

        System.out.println(oldMsg);

        //new code or modern code
        List<String> blankList = List.of();
        List<String> message = List.of("hi","hello","how","are","you");
        //System.out.println(message+" " + blankList);

        //for-each loop old-fashioned
        for(String msg : message){
            System.out.println("msg " + msg);
        }

        //modern
        message.forEach(System.out::println);

        Set<String> blankSet = Set.of();
        Set<String> testSet = Set.of("hi","hello","how","are","you");
        System.out.println(blankSet + " " + testSet);

        Map<Integer , String > blankMap = Map.of();

        Map<Integer,String> dataMap = Map.of(1 ,"hi" , 2 ,"Hello" ,3,"how",4,"are",5,"you");
            dataMap.forEach((key,value) ->{
             System.out.println("key " + key + "value");
            });
    }

}
