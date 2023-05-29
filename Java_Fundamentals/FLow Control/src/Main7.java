//Flow control 7
import java.util.Scanner;
import java.lang.Character;
public class Main7 {
    public static void main(String[] args){
        System.out.println("Enter the letter:");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println(Character.toLowerCase(a));
        }
        else {
            System.out.println(Character.toUpperCase(a));
        }

    }
}
