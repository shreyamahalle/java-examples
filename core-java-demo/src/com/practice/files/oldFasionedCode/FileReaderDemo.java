package src.com.practice.files.oldFasionedCode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    private static final String file_path = "C:\\Users\\home\\Downloads\\filedemo\\";
    private static final String  file_name = "text.txt";

    public static void main(String[] args) {
        BufferedReader buffer = null;
        try {
            Reader fileReader = new FileReader(file_path + file_name);
            buffer = new BufferedReader(fileReader);

            System.out.println("--------------- start of file -------------------");
            String strCurrentLine;
            while ((strCurrentLine = buffer.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
            System.out.println("------------ end of file ------------");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (buffer != null)
                    buffer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}