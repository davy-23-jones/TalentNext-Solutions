import java.util.Scanner;

//String 7
public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x' ){
            System.out.println(str.deleteCharAt(0).deleteCharAt(str.length()-1));
        }
        else System.out.println(str);
    }
}
