package src.com.shreya.conditionalstatement.ifelseladder;

public class NestedIfStatement {
    public static void main(String[] args) {
        //nested if example
        //pseudocode
        //enter weight and age to check you are eligible blood donate.
        //if age is >= 25 the eligible
        //if weight is >= 50 then eligible for blood donate
        int age = 25;
        int weight = 50;
        if(age >= 25){
            if(weight>50){
                System.out.println("you are eligible to donate blood");
            }
            else{
                System.out.println("you are not eligible to donate blood");
            }
        }
        else{
            System.out.println("age must be greater than 18");
        }
    }
}
