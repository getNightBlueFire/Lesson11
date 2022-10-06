package lesson11;

public class PasswordCheckException extends Exception{

    public String getDiff() {
        return diff;
    }

    private final String diff;


    public PasswordCheckException(String message,String diff) {
        super(message);
        this.diff = diff;
    }
}
