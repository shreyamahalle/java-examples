package src.com.practice.collection.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapReDemo {
    public static void main(String[] args) {
        Map<Integer,String> cityMap = new HashMap<>();
        cityMap.put(1,"Delhi");
        cityMap.put(2,"Mumbai");
        cityMap.put(3,"Delhi");
        cityMap.put(4,"Nagpur");
        System.out.println(cityMap);
        System.out.println("=========================================");
}
}