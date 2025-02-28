package src.com.practice.staticClass;

public class ParentOuter {
   private String message = "Hello from parent outer class";

    class MemberInner{
       void printMessage(){
           System.out.println("message " + message);
       }
   }
}
