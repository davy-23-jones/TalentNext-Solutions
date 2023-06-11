import java.util.Scanner;

//String 8
public class Main8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        String s = str.toString();
        char[] arr = s.toCharArray();
        StringBuffer newstr = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(arr[i]=='*'){
                newstr = str.delete(i-1, i+2);
            }
            
        }
        System.out.println(newstr);
    }
}
