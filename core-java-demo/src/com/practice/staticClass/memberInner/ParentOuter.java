package src.com.practice.staticClass.memberInner;

public class ParentOuter {
   private String message = "Hello from parent outer class";

    class MemberInner{
       void printMessage(){
           System.out.println("message " + message);
       }
   }
}
