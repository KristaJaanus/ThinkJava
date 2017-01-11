package Chapter6;
/**
 * Created by Krista
 */
public class oddSum {
    public static void main(String[]args){
        int n = 2;

        if(n >= 2){
            System.out.println("Negatiivne number");
        }
        else
        {
           oddSum(n);
        }
        System.out.println(oddSum(n));
    }
    public static int oddSum(int n) {
        if (n <= 0)
        {
            return 0;
        }
        if (n % 2 == 0) {
            return ((n - 1) + oddSum(n - 2));
        }
                else

                return (n + oddSum(n - 2));
            }


    }



