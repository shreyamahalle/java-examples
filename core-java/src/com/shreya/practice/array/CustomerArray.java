package com.shreya.practice.array;
import java.util.Scanner;

public class CustomerArray {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CustomerArray customerArray = new CustomerArray();
        Customer customer = customerArray.acceptCustomerRegistration();
        System.out.println("Customer =" + customer );
    }
    static class Customer{
        String fName;
        String lName;

        public Customer(String fName , String lName){
            this.fName = fName;
            this.lName = lName;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "fName='" + fName + '\'' +
                    ", lName='" + lName + '\'' +
                    '}';
        }
    }
    private Customer acceptCustomerRegistration(){
        System.out.println("Enter First Name");
        String fName = scanner.nextLine();
        System.out.println("Enter Last Name");
        String lName = scanner.nextLine();
        return new Customer(fName,lName);
    }
}
