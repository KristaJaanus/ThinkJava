/**
 * Created by Krista Jaanus Ex 3.3
 */
import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        int seconds, hours, minutes;
        Scanner input = new Scanner(System.in);

        System.out.println("input a pole of seconds: ");
        seconds = input.nextInt();

        System.out.printf("Entered %d seconds", seconds);
        System.out.printf("\n Converted it shall be around: \n");
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.printf("%d hours, %d minutes, %d seconds" , hours, minutes, seconds);
    }

}
