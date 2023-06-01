import java.util.Scanner;

//Class and objects 2
public class Main2 {
    public static void main(String[] args){
    calculate c =  new calculate();
    System.out.println("Enter the two numbers:");
    Scanner sc =  new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println("Enter the other two numbers:");
    double num3 = sc.nextDouble();
    double num4 = sc.nextDouble();
    System.out.println("First method:"+c.powerint(num1, num2));
    System.out.println("Second method:"+c.powerint(num3, num4));
    }
}
class calculate{
    public static int powerint(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    public static double powerint(double num1, double num2){
        return Math.pow(num1, num2);
    }
}
