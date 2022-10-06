package lesson11;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        //String confirm = sc.nextLine();

        try {
            PasswordUtils.process(password, password);
            System.out.println("OK");
        } catch (PasswordCheckException e) {
            System.out.println("password invalid");
            System.out.println(e.getMessage());
            System.out.println(e.getDiff());
        }
    }
}
