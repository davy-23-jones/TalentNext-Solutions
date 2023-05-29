import java.util.Scanner;

//Array 3
public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.println("Enter the number you want to search");
        int num = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Number found in:"+i);
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}
