package Model.Exceptions;

public class ExceedsWithdrawLimitException extends Exception{
    public ExceedsWithdrawLimitException(String message){
        super(message);
    }
}
