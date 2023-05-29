//Flow Control 8
import java.util.*;
public class Main8{
    public static void main(String[] args){
        System.out.println("Enter the colour code:");
        Scanner sc = new Scanner(System.in);
        char color = sc.next().charAt(0);
        switch(color){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
        }
    }
}