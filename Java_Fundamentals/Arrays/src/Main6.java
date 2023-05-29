//Array
public class Main6 {
    public static void main(String[] args) {
        int a[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int temp = 0;
        System.out.println("Array before sorting:");
        for(int i:a)
            System.out.print(i+" ");
        for(int i = 0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array:");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
