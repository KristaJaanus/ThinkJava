package Chapter7;

/**
 * Created by Krista
 */
public class Countdown {
    public static void main(String[] args) {
    }

    public static void countdown (int n){
        while (n > 0) {
            System.out.println(n);
            n = n-1;
        }
        System.out.println("Blastoff!");
    }
}
