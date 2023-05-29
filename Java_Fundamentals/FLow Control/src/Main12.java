//Flow Control 12
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean primeornot = true;
        for(int i =2;i<num; i++){
            if(num%i==0){
                primeornot = false;
                break;
            }
            else primeornot = true;
        }
        if(primeornot)
            System.out.println("Prime");
        else System.out.println("Not prime");
    }
}
