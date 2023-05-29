//FLow Control 13
import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        for (int j = 10; j <=99; j++) {
            if (isPrime(j)) {
                System.out.print(j+" ");
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (n/2)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
