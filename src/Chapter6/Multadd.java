package Chapter6;


/**
 * Created by Krista
 */
public class Multadd {
    public static void main(String[]args){
        System.out.println("Vastus on: ");
        multAdd(1.0, 2.0, 3.0);

        double a1= Math.cos(Math.PI/4.0);
        double b1 = 1.0/2.0;
        double c1= Math.sin(Math.PI/4.0);
        System.out.println("Teine vastus:");
        multAdd(a1,b1,c1);

        double a2 = 1;
        double b2 = Math.log(10);
        double c2 = Math.log(20);
        System.out.println("Kolmas vastus on:");
        multAdd(a2, b2, c2);


    }
        public static double multAdd(double a, double b, double c){

        double result = (a*b)+c;
        System.out.println(result);
        return result;


    }
}
