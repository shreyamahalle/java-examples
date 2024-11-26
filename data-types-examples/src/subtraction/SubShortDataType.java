package subtraction;

public class SubShortDataType {
    public void subtract() {
        /*
        pseudocode(Steps)
        two variables.
        perform sub
        print the output
         */
        short n1 = 34;
        short n2 = 225;
        System.out.println("Subtraction is " + (n1 - n2));
    }

    public static void main(String[] args) {
        SubShortDataType sb = new SubShortDataType();
        sb.subtract();
    }
}
