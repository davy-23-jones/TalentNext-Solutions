//Flow Control 4
import java.util.Scanner;

public class Main4{
    public static void main(String[] args){
        System.out.println("Enter the characters:");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int ch1 = a;
        int ch2 = b;
        if(ch1<ch2){
            System.out.println(a+" "+b);
        }
        else System.out.println(b + " " + a);
    }
}
