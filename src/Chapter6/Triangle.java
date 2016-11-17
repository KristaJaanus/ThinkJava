package Chapter6;

/**
 * Created by Krista
 */
public class Triangle {
    public static void main(String[]args){
        System.out.println (isTriangle (2.0, 4.0, 6.0));
    }
    public static boolean isTriangle (double a, double b, double c){
        if ((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else{
            return false;
        }
    }
}
