package Chapter3;
/**
 * Created by Krista Jaanus Ex 3.4
 */
import java.util.Random;
import java.util.Scanner;

public class GuessN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int userNumber = 9;

        if (userNumber == number){
            System.out.printf("Palju õnne!");
        } else {
            System.out.printf("Sa arvasid: %d ,aga number oli %d. Erinevus minu mõeldud numbrist on %d. ",
            userNumber, number, userNumber- number);
        }

    }

}
