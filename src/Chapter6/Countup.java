package Chapter6;

/**
 * Created by john on 17.11.2016.
 */
public class Countup {
        public static void main (String[]args){
        }
        public static void countup(int n){
            if(n == 0){
                System.out.println("Blastoff!");
            }else{
                countup (n - 1);
                System.out.println(n);
            }
        }

}
