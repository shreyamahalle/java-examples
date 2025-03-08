package src.com.shreya.java8Features.streamApi;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    List<Customer> customers = new ArrayList<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

//    public void applyDiscount(int percentage){
//        customers.stream().parallel()
//                .filter(customer -> customer.applyDiscount(10)) //to apply filter conditions
//
//    }
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.add(customer);

    }
}
