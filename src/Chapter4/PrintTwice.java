package Chapter4;

/**
 * Created by Krista Jaanus
 */
public class PrintTwice {
    public static void printTwice(String s){
        System.out.println(s);
        System.out.println(s);
    }
    public static void main(String[]args){
        printTwice("Don't make me say this twice!");
    }
}
