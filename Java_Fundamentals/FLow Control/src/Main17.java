import java.util.Scanner;

//Flow Control 17
public class Main17 {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num;
        int org = num;
        int rev = 0;
        for(;a!=0;a=a/10){
            int d = a%10;
            rev = rev*10 + d;
        }
        if(org == rev)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }
}
