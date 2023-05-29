//Array 10
public class Main10 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                b[i]=a[i];
            }
        }
        int writeIndex = 0;
        int[] c = new int[b.length];
        for (int i = 0;i<b.length;i++) {
            if (b[i]!=0) {
                c[writeIndex] = b[i];
                writeIndex++;
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                c[writeIndex]=a[i];
                writeIndex++;
            }
        }
        System.out.println("\nSorted array is:");
        for(int i:c)
            System.out.print(i+" ");
    }
}
