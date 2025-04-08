package src.com.shreya.exception.CheckedExceptionsCompileTime;

import java.io.FileReader;

public class CheckedExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");  // FileNotFoundException
    }
}