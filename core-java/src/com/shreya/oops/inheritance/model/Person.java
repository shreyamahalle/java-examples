package src.com.shreya.oops.inheritance.model;

public class Person {
    private  String name;
    private Address address;

    public Person(String alice) {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
