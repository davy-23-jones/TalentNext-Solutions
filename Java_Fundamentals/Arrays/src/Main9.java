//Array 9
public class Main9 {
    public static void main(String[] args){
        int[] a = {1, 2,10, 10, 8, 6};
        int[] b = new int[a.length];
        int w = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==10){
                continue;
            }
            else {
                b[w]=a[i];
                w++;
            }
        }

        for(int i:b)
            System.out.print(i+" ");
    }
}
