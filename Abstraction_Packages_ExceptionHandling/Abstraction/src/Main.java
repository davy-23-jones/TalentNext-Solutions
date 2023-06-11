import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Abstraction 1
public class Main {
    public static void main(String[] args) {
        Compartment[] cmparr = new Compartment[10];
        Random rand = new Random();
        System.out.println("COMPARTMENTS:");
        int num;
        int a = 1;
        int b = 5;
        int j = 0;
        int[] arr = new int[5];
        num = rand.nextInt(a, b);
        System.out.println(num);
        switch (num) {
            case 1:
                cmparr[j] = new Firstclass();
                System.out.println(cmparr[j].notice());
                j++;
                break;
            case 2:
                cmparr[j] = new Ladies();
                System.out.println(cmparr[j].notice());
                j++;
                break;
            case 3:
                cmparr[j] = new General();
                System.out.println(cmparr[j].notice());
                j++;
                break;
            case 4:
                cmparr[j] = new Luggage();
                System.out.println(cmparr[j].notice());
                j++;
                break;

        }
    }
}
abstract class Compartment{
    public abstract String notice();
}
class Firstclass extends Compartment{
    public String notice(){return "First class compartment";}
}
class Ladies extends Compartment{
    public String notice(){return "Ladies compartment";}
}
class General extends Compartment{
    public String notice(){return "General compartment";}
}
class Luggage extends Compartment{
    public String notice(){return "Luggage compartment";}
}