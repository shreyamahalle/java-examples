package src.com.practice.pattern;

public class PatternNew {
    private static final int patternSize = 5;

    public static void main(String[] args) {
        int lineno = 0;
        while(lineno < patternSize){
            int index = patternSize - lineno;
            while(index < patternSize){
                System.out.print("*\t");
                index++;
            }
            System.out.println();
            lineno++;
        }
    }
}
