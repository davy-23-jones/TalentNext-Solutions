import java.util.Scanner;
import java.lang.Character;

//Flow control 5
public class Main5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        if(Character.isAlphabetic(ch)) {
            System.out.println("Alphabet");
        }
        else if(Character.isDigit(ch))
            System.out.println("Number");
        else
            System.out.println("Special Character");
    }
}


