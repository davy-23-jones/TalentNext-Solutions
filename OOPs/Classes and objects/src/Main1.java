//Classes and objects 1
public class Main1 {
    public static void main(String[] args){
        box bi = new box(10, 11, 12);
        System.out.println("Volume of the given box is:"+bi.calculatevol());

    }
}
class box{
    private static int height, width, breadth;

    public box(int h, int w, int b){
        height  = h;
        width  = w;
        breadth = b;
    }
    public int calculatevol(){
        return height*width*breadth;
    }
}
