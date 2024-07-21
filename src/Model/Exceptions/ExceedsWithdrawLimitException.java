package Model.Exceptions;

public class ExceedsWithdrawLimitException extends RuntimeException{
    public ExceedsWithdrawLimitException(String message){
        super(message);
    }
}
