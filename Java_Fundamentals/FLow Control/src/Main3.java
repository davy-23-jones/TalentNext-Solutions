import java.util.Scanner;
//Flow control 3
public class Main3 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
        int i1 = 0;
        System.out.println("Enter the city names:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
            if(arr[i]=="")
                break;
            i1++;
        }
        if (i1==0) {
            System.out.println("No values");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
