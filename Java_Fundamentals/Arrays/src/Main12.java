//Array 12
public class Main12 {
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = new int[2];
        int j = 0;
        for(int i=0;i<a.length;i++){
            if(i==(a.length)/2){
                c[j] = a[i];
                j++;
            }
        }
        for(int i = 0;i<b.length;i++){
            if(i==(int)(b.length)/2){
                c[j] = b[i];
                j++;
            }
        }
        for(int i:c)
            System.out.print(i+" ");
    }
}
