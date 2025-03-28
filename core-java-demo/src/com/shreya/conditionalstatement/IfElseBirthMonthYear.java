package src.com.shreya.conditionalstatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class IfElseBirthMonthYear {

    public static final int PKG_COST = 45000;
    private static final Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter your birthdate in the format of dd-MM-yyyy ");

        String strDate = sc.nextLine();
        DateTimeFormatter  formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate customerBirthdate = LocalDate.parse(strDate,formatter);

        System.out.println("Customer entered birthdate as " + customerBirthdate);



    }
}
