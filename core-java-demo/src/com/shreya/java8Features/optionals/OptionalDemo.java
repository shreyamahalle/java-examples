package src.com.shreya.java8Features.optionals;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // java 8 features optional
        Person  person = getPerson();

        // 1. isEmpty()
        Optional<String> optionalContainer = Optional.empty();

        System.out.println("optionalContainer is Empty? :" + optionalContainer.isEmpty());

        // 2. of()
        optionalContainer = Optional.of("pune");

        // 3. isPresent()
        if (optionalContainer.isPresent()) {
            System.out.println("Values in optional container using isPresent() : " + optionalContainer.get());
        } else {
            System.out.println("no items present");
        }

        System.out.println(optionalContainer.map(string -> "Values in optional container using isPresent() : " + string).orElse("no items present"));

        // 4. ifPresent()
        optionalContainer.ifPresent(item -> System.out.println("ifPresent() : " + item.length()));

        // 5. map()
        System.out.println(optionalContainer.map(s -> "Values in optional container using 'optionalContainer.map(s -> string).orElse(string)' : " + s).orElse("no items present"));

        // 6. ofNullable()
        optionalContainer = Optional.ofNullable(null);
        System.out.println("Optional container made ofNullable()..");
        System.out.println("ofNullable(null) -> isEmpty()? " + optionalContainer.isEmpty());

        // 7. isPresent()
        System.out.println("ofNullable(null) -> isPresent()? " + optionalContainer.isPresent());
    }
    static class Person{
        public int id;
        public String name;
    }

    private static Person getPerson(){
        return null;
    }
}