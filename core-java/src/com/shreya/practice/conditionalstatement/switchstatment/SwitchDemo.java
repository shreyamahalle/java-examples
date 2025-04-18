package com.shreya.practice.conditionalstatement.switchstatment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class SwitchDemo {
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

        double actualDiscount = (totalDiscount / 100) * PKG_COST;

        int finalPackageCost = PKG_COST - (int) actualDiscount;
        System.out.println("your total discount is " + actualDiscount);
        System.out.println("Final Package price is " + finalPackageCost);

    }  //** Month wise discount Business rules:

    //- Jan, Feb, Mar - 3% discount
    //- April, May, June - 4% discount
    //- July, Aug, Sept - 10% discount
    //- Oct, Nov, Dec - 0% discount
    public static double calculateDiscountMonth(int month) {
        double monthWiseDiscount = 0.0;
        switch (month) {
            case 1, 2, 3:
                monthWiseDiscount = 3.0;
                break;
            case 4, 5, 6:
                monthWiseDiscount = 4.0;
                break;
            case 7, 8, 9:
                monthWiseDiscount = 10.0;
                break;
            default:
                monthWiseDiscount = 0.0;
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
        switch (date) {
            case 1, 2, 3, 4, 5:
                dateWiseDiscount = 2.0;
                break;
            case 6, 7, 8, 9, 10:
                dateWiseDiscount = 2.5;
                break;
            case 11, 12, 13, 14, 15:
                dateWiseDiscount = 1.0;
                break;
            case 16, 17, 18, 19, 20:
                dateWiseDiscount = 1.5;
                break;
            case 21, 22, 23, 24, 25:
                dateWiseDiscount = 3.0;
                break;
            case 26, 27, 28, 29, 30, 31:
                dateWiseDiscount = 3.5;
                break;
        }
        return dateWiseDiscount;
    }
}
