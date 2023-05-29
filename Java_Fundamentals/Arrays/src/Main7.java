import java.util.Scanner;

//Array 7
public class Main7 {
    public static void main(String[] args){
        int arr[] = new int[5];
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the numbers in the array:");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = 0;
        int arr1[] = new int[5];
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                else{
                    arr1[k] =arr[i];
                }
            }
        }
        System.out.println("Array after deleting all the duplicate elements are:");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
