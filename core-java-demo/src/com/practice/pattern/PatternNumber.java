package src.com.practice.pattern;
public class PatternNumber {
    //pseudocode
    //print pattern
    //            1
    //           2 2
    //          3 3 3
    //         4 4 4 4
    //        5 5 5 5 5
    public static void printPattern(int n){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);

    }
}
