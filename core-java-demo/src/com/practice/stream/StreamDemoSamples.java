package src.com.practice.stream;

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
        oldMsg.add("Helloo");
        oldMsg.add("how");
        oldMsg.add("are");
        oldMsg.add("you");

        System.out.println(oldMsg);

        //new code or modern code
        List<String> blankList = List.of();
        List<String> message = List.of("hi","hello","how","are","you");
        System.out.println(message+" " + blankList);

        Set<String> blankSet = Set.of();
        Set<String> testSet = Set.of("hi","hello","how","are","you");
        System.out.println(blankSet + " " + testSet);

        Map<Integer , String > blankMap = Map.of();
        Map<Integer,String> dataMap = Map.of(1 ,"hi" , 2 ,"Hello" ,3,"how",4,"are",5,"you");
        System.out.println(blankMap + " " + dataMap);
    }
}
