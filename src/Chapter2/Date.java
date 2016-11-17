package Chapter2;

/**
 * Created by Krista Jaanus Ex 2.2
 */
public class Date {
    public static void main (String[]args) {
        String day = "Thursday ";
        int date = 19;
        String month = "October ";
        int year = 2016;

        System.out.print("American format:");
        System.out.println(day + "," + month + date + "," + year);
        System.out.println();

        System.out.print("European format:");
        System.out.println(day + date +" "+ month + year);


    }
}
