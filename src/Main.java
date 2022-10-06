import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int z = new Scanner(System.in).nextInt();

        String[] arr = new String[10];





        System.out.println(arr[21]);
        int x;
        try {
            x = a / z;
        } catch (NumberFormatException ex) {

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Throwable e) {

            System.out.println("oops" + e.getMessage());
        } finally {
            x =  (int) (a / (0.01));
        }
        System.out.println(x);

    }
}