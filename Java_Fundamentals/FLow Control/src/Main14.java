import java.util.Scanner;

//Flow Control 14
public class Main14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }
        System.out.println("Sum of the digit of the number are:"+sum);
    }
}
