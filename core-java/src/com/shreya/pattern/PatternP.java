package src.com.shreya.pattern;

public class PatternP {
    public static void main(String[] args) {
        int col = 0;
        while(col < 5) {

            int row = 0;
            while(row <=  col) {
                System.out.print( col + " \t");
                row++;
            }
            System.out.println();
            col++;
        }
    }
}
