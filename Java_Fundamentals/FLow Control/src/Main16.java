import java.util.Scanner;

//Flow Control 16
public class Main16 {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(;num!=0; num=num/10){
            int digit = num%10;
            System.out.print(digit);
        }
    }
}
