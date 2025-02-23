package src.com.practice.exception.customException;

public class InvalidBookException extends  Exception{
    public InvalidBookException(String message){
        super(message);
    }
}
