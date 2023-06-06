import java.util.Scanner;

//String 10
public class Main10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        int n = sc.nextInt();
        String newstr = str.substring(str.length()-3, str.length());
        System.out.println(newstr.repeat(n));

    }   
}
