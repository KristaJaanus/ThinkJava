package Chapter6;

/**
 * Created by Krista
 */
public class Jagamine {
    public static void main(String[]args) {

        System.out.println(isDivisible(10, 50));
    }

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }

    }

}

