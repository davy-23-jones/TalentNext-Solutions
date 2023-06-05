import java.util.Scanner;

//String 6
public class Main6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two strings:");
        String a = sc.next();
        String b = sc.next();
        if(a.length()<b.length()){
            System.out.println(a+b+a);
        }
        else System.out.println(b+a+b);
    }
}