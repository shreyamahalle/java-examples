package src.com.shreya.enums;

public class Address {
    String city;
    int pincode;
    Direction direction;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                ", direction=" + direction +
                '}';
    }
}

enum Direction {
    EAST("east"), WEST("west"), SOUTH("a"), NORTH("a");

    Direction(String east) {
    }
}

