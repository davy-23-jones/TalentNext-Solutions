//Array 5

public class Main5 {
    public static void main(String[] args){
        int a[] ={1,2,3,4,5,6,7,8,9};
        int max = 0;
        int min = a[0];
        int max2 = 0;
        for(int i:a){
            if(i>max){
                max = i;
            }
            else if(i<max2){
                min = i;
            }
        }
        for(int i:a) {
            if (i == max) {
                continue;
            } else if (i > max2) {
                max2 = i;
            }
        }int min2 = max;
        for(int i:a) {
            if (i == min) {
                continue;
            } else if (i < min2) {
                min2 = i;
            }
        }
        System.out.println("Max and min numbers are:"+max+" "+min);
        System.out.println("Second max and min numbers are:"+max2+" "+min2);
    }
}
