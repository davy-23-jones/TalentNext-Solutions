import java.util.Scanner;

//Array 2
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the items in the array");
        int arr[] = new int[5];
        int max = 0;
        for(int i = 0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Max and min numbers in the array are:"+max+" "+min);
    }
}
