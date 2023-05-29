//Array 8
public class Main8 {
    public static void main(String[] args){
        int[] a = {1,2,3,6,8,9,7,9};
        int sum = 0;
        boolean exclude = false;
        for(int i: a){
            if(i==6){
                exclude = true;
                continue;
            }
            else if(i==7){
                exclude = false;
                continue;
            }
            if(exclude == false){
                sum=sum+i;
            }
        }
        System.out.println("Sum is:"+sum);
    }
}

