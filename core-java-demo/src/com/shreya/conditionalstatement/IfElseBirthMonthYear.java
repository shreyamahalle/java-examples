package src.com.shreya.conditionalstatement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
// Pseudocode:
// ** we have a tourism company, based on customer's birthdate, we will offer them best possible discount:
//
//pkg details: 35,000 per head
//
//accept birt date: offer them best discount.
//
//Business rules:
//- Jan, Feb, Mar - 3% discount
//- April, May, June - 4% discount
//- July, Aug, Sept - 10% discount
//- Oct, Nov, Dec - 0% discount
//
//** dates wise discount:
//- 1-5 : 2%
//- 5-10 : 2.5%
//- 10-15 : 1%
//- 15-20 : 1.5%
//- 20-25 : 3%
//- 25-31 : 3.5%

//
//Pseudocode:
//- define Constant for pkg_cost = 35000
//- accept birthdate from customer
//- Calculate discount for month
//- Calculate discount for date
//- combine and make sum of both discounts created for month and date
//- actual_discount = (percent/100) * pkg_cost
//- final_pkg_cost = pkg_cost - actual_discount
//- display final_pkg_cost


public class IfElseBirthMonthYear {

    public static final int PKG_COST = 45000;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter your birthdate in the format of dd-MM-yyyy ");

        String strDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate customerBirthdate = LocalDate.parse(strDate, formatter);

        System.out.println("Customer entered birthdate as " + customerBirthdate);

        double totalDiscount = 0.0;
        totalDiscount = totalDiscount + calculateDiscountMonth(customerBirthdate.getMonthValue());
        totalDiscount = totalDiscount + calculateDiscountDate(customerBirthdate.getDayOfMonth());

        double actualDiscount = (totalDiscount/100) * PKG_COST;

       int finalPackageCost = PKG_COST -(int) actualDiscount;
        System.out.println("your total discount is " +  actualDiscount);
        System.out.println("Final Package price is " + finalPackageCost);

    }  //** Month wise discount Business rules:

    //- Jan, Feb, Mar - 3% discount
    //- April, May, June - 4% discount
    //- July, Aug, Sept - 10% discount
    //- Oct, Nov, Dec - 0% discount
    public static double calculateDiscountMonth(int month) {
        double monthWiseDiscount = 0.0;
        if (month >= 1 && month <= 3) {
            monthWiseDiscount = 3.0;
        }
        if (month >= 4 && month <= 6) {
            monthWiseDiscount = 4.0;
        }
        if (month >= 7 && month <= 9) {
            monthWiseDiscount = 10.0;
        }
        return monthWiseDiscount;
    }

    //** dates wise discount business rules:
    //- 1-5 : 2%
    //- 5-10 : 2.5%
    //- 10-15 : 1%
    //- 15-20 : 1.5%
    //- 20-25 : 3%
    //- 25-31 : 3.5%
    public static double calculateDiscountDate(int date) {
        double dateWiseDiscount = 0.0;
        if (date >= 1 && date <= 5) {
            dateWiseDiscount = 2.0;
        } else if (date >= 5 && date <= 10) {
            dateWiseDiscount = 2.5;
        } else if (date >= 15 && date <= 20) {
            dateWiseDiscount = 1.0;
        } else if (date >= 20 && date <= 25) {
            dateWiseDiscount = 3.0;
        } else if (date >= 25 && date <= 31) {
            dateWiseDiscount = 3.5;
        }

        return dateWiseDiscount;
    }
}
