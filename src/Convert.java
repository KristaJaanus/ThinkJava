/**
 * Created by Krista Jaanus Ex 3.2
 */
import java.util.Scanner;

public class Convert {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double cels;
        double fah;

        System.out.print("Convert Celsius to Fahrenheit ");
        try{
            cels = input.nextDouble();
            fah = cels * (9.0/5.0) + 32;
            System.out.println(cels + " C " + " = " + fah + " F");
        } catch (Exception err) {
        }

    }
}
