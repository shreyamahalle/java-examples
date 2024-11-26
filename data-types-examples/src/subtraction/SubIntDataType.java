package subtraction;

public class SubIntDataType {
    public void subtract(){
        /*
        pseudocode(Steps)
        two variables.
        perform sub
        print the output
         */
        int n1 = 5;
        int n2 = 8;
        System.out.println("Subtraction is " + (n1 - n2 ));
    }

    public static void main(String[] args) {
        SubIntDataType sb = new SubIntDataType();
        sb.subtract();
    }
}
