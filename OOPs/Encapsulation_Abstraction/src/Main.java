//Encapsulation 1
public class Main {
    public static void main(String[] args){
        Books book = new Books("Pet Semetary", 300.00, 5000);
        book.getter();
    }
}
class Authors{
    private String name;
    private String email;
    private char gender;
    public Authors(String n, String e, char g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }
    public String getName(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
}
class Books{
    private String name;
    Authors auth = new Authors("Stephen King", "stephenk@gmail.com", 'M');
    private double price;
    private int qtystock;
    public Books(String n, double p, int q){
        this.name = n;
        this.price = p;
        this.qtystock = q;
    }
    public void getter(){
        System.out.println(name+","+auth.getName()+","+auth.getemail()+","+auth.getGender()+","+price+","+qtystock);
    }

}
