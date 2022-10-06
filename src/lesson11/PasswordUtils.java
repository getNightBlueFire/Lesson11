package lesson11;

public class PasswordUtils {

    public static void process(String password, String confirm) throws PasswordCheckException, NullPointerException {
        if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            throw new PasswordCheckException("", "");
        }

        if (!password.equals(confirm)) {
            String dif = confirm.replace(password, "");
            String message = "confirm invalid";
            throw new PasswordCheckException(message, dif);
        }
    }

}
