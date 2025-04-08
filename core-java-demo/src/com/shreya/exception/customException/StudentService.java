package src.com.shreya.exception.customException;
import java.nio.InvalidMarkException;
import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);
    public void addMarks() throws InvalidMarkException {
    int marks = Integer.parseInt(sc.nextLine());

    if(marks > 100 || marks <0){
        throw new InvalidMarkException();

    }
    }
}
