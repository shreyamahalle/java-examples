package src.com.shreya.pattern;

public class ForLoopPattern
{
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
