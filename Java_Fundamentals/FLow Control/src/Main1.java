//Flow Control Statements
import java.util.Scanner;
//A
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a > 0)
            System.out.println("The number is positive");

        else if (a < 0)
            System.out.println("The number is negative");
        else
            System.out.println("The number is zero");
        //B
        System.out.println("Enter the numbers:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(lastdigit(c,d));
    }//B
    static String lastdigit(int c, int d){
        if((c-d)%10==0)
            return "True";
        else
            return "False";
    }
}

