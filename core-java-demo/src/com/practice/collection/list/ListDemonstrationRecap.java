package src.com.practice.collection.list;
import java.util.ArrayList;
public class ListDemonstrationRecap {
    public static void main(String[] args) {
        String city = "Mumbai";

        String citiess[] = new String[3];
        citiess[0] = "Pune";
        citiess[1] = "Mumbai";
        citiess[2] = "Delhi";

        //hard code alternative....
        String [] cities = {"pune","mumbai","delhi"};//array used

        ArrayList cityList = new ArrayList(); // collection used. ArrayList is a class name
        cityList.add("pune");
        cityList.add("mumbai");
        cityList.add("delhi");

        System.out.println("citiess " + citiess);
        System.out.println("city " + city);
        System.out.println("cities " + cities);
        System.out.println("ArrayList cityList " + cityList);

    }
}
