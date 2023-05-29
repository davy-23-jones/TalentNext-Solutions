//Flow Control 6
import java.util.Scanner;
public class Main6{
    public static void main(String[] args){
        System.out.println("Enter the values:");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int age = sc.nextInt();
        float percentofinterest = 0;
        if(a.equals("Male")){
            if(age<58  && age>1){
                percentofinterest = 8.4F;
            }
            else percentofinterest = 10.5F;
        }
        else if(a.equals("Female")) {
            if(age<58 && age>1){
                percentofinterest = 8.2F;
            }
            else percentofinterest = 9.2F;
        }
        System.out.println("The percentage of interest is:"+percentofinterest+"%");
    }
}