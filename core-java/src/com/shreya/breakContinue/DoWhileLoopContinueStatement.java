package src.com.shreya.breakContinue;

public class DoWhileLoopContinueStatement {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        } while (i < 5);
    }
}