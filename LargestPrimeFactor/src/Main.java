import java.math.BigInteger;
import java.util.*;

public class Main {

   public static boolean isPrime (long number) {

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
   }

    public static void largestPrimeFactor(long number) {
       long largestPrimeFactor = number;

        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    largestPrimeFactor = i;
                }
            }
        }
        System.out.println("The largest prime factor = " + largestPrimeFactor);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value : ");
        long v = in.nextLong();
        largestPrimeFactor(v);
    }
}
