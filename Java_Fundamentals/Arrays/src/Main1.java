//Array 1
public class Main1{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for (int i: a){
            sum = sum + i;
        }
        int avg = sum/(a.length);
        System.out.println("Sum of the numbers are:"+sum);
        System.out.println("Average of the numbers are:"+avg);


    }
}