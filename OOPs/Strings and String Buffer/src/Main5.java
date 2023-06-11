import java.util.Scanner;

//String 5
public class Main5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        String newstr = str.substring(1, str.length()-1);
        System.out.println(newstr);

    }
}
