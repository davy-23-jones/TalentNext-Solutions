import java.util.Scanner;

//Flow Control 2
public class Main2{
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}