//Array 11
public class Main11 {
    public static void main(String[] args){
        int[] a = {1,1,1,4,4,1,1};
        boolean ans = false;
        for(int i:a){
            if(i==1 || i==4){
                ans = true;
            }
            else 
                ans = false;
        }
        System.out.println(ans);
    }
}
