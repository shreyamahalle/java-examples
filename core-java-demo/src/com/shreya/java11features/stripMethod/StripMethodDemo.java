package src.com.shreya.java11features.stripMethod;

public class StripMethodDemo {
    public static void main(String[] args) {
        var nextWhiteSpaceString = "\n\t\u2008hello how are you\u2005";
        System.out.println("our string " + nextWhiteSpaceString);
        System.out.println("our string after trim() " + nextWhiteSpaceString.trim());
        System.out.println("our string after strip() " + nextWhiteSpaceString.strip());
    }
}
