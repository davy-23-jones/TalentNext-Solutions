import java.util.Scanner;

//String 1
public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        StringBuffer st = new StringBuffer(string);
        StringBuffer ts = new StringBuffer(string);
        if(ts.toString().equals(st.reverse().toString())){
            System.out.println("Palindrome");
        }
        else System.out.println("Not a palindrome");
    }
}
