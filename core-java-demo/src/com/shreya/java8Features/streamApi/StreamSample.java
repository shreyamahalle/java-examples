package src.com.shreya.java8Features.streamApi;
import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        List<String> cities = List.of("pune","mumbai","delhi","nashik","bangalore");

        List<String> filteredCities = cities.stream().parallel()
                .filter(city -> city.contains("a"))
                .map(city -> city.substring(0,2))
                .toList();

        System.out.println(filteredCities);
        System.out.println(cities.stream().parallel()
                .filter(city -> city.contains("a"))
                .map(city -> city.substring(0,2))
                .findAny());
    }
}
