package src.com.practice.strings;

public class StringDemo {
    public static void main(String[] args) {

        String str = "India";//string literal
        String str1 = new String("India");//string object
        System.out.println("String literal " + str );
        System.out.println("String object " + str1);

        //immutable object trying to change
        str1 = new String("India132342");
        System.out.println(str1);
        System.out.println("--------------------------------");

        //mutable object - for non-multi-threading application
        StringBuilder wish = new StringBuilder(" hi hello ");
        System.out.println("current object " + wish);
        wish.append(" happy birthday ");
        System.out.println("current object " + wish);
        wish = new StringBuilder("new data");
        System.out.println("current object " + wish );
        System.out.println("--------------------------------------");

        //mutable object for multi-threading application
        StringBuffer stringBuffer = new StringBuffer("hi");
        System.out.println("current string buffer " + stringBuffer);
        stringBuffer.append("all good?");
        System.out.println("string " + stringBuffer);
        stringBuffer = new StringBuffer("ssssssssssss");
        System.out.println("current string buffer " + stringBuffer);

    }
}
