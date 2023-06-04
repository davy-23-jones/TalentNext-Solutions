import java.util.Locale;
import java.util.Scanner;

//String 2
public class Main2 {
    public static void main(String[] args){
        System.out.println("Enter the two string:");
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        StringBuffer c = new StringBuffer(a);
        StringBuffer d = new StringBuffer(b);
        StringBuffer concat;
        if(a.charAt(a.length()-1)==(b.charAt(0))){
            c.deleteCharAt(c.length()-1);
            concat = c.append(d);
        }
        else concat = c.append(d);
        System.out.println(concat);
    }
}
