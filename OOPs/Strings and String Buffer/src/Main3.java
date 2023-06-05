import java.util.Scanner;

//String 3 
public class Main3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        int n = str.length();
        String newstr = str.substring(0, 2);
        System.out.println(newstr.repeat(n));
        
    }
}