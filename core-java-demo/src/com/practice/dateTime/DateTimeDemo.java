package src.com.practice.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        //current date
        LocalDate todayDate = LocalDate.now();
        System.out.println("Todays Date is " + todayDate);

        LocalDateTime todayTime = LocalDateTime.now();
        System.out.println("todays time is " + todayTime);
        LocalDateTime oneMinitLaterDateTime = todayTime.plusMinutes(1);
        System.out.println("After 1 minute date will be " + oneMinitLaterDateTime);

        //add 1 month to current date
        LocalDate onemonthLaterDate = todayDate.plus(1, ChronoUnit.MONTHS);
        System.out.println("After 1 month date will be :" + onemonthLaterDate);

        LocalDate twentyEightDayAgoDate = todayDate.minus(28,ChronoUnit.DAYS);
        System.out.println("28 days ago date was " + twentyEightDayAgoDate);


    }
}
