import java.util.Scanner;

//String 9
public class Main9{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        StringBuffer a = new StringBuffer(sc.next());
        StringBuffer b = new StringBuffer(sc.next());
        StringBuffer newstr = new StringBuffer();
        for(int i=0,j=0;i<a.length() && j<b.length();i++,j++){
            newstr.append(a.charAt(i)).append(b.charAt(j));
        }
        System.out.println(newstr);
    }
}