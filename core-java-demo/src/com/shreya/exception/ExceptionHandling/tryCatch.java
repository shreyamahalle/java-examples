package src.com.shreya.exception.ExceptionHandling;

public class tryCatch {
    public static void main(String[] args)throws Exception {
        try{
            int no = 0;
        } catch (ArithmeticException e){
            System.out.println("can not divide by 0");
        }finally {
            System.out.println("Finally block is called...!!!");
        }
    }
}
