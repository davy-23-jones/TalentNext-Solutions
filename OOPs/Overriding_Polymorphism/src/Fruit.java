//Overriding and polymorphism 1
public class Fruit {
     String name;
     String taste;
     char size;
    public void eat(String name, String taste){
        this.name = name;
        this.taste = taste;
    }
}
class Apple extends Fruit{
    public void eat(String name, String taste){
        this.name = name;
        this.taste = taste;
    }
}
class Orange extends Fruit{
    public void eat(String name, String taste){
        this.name = name;
        this.taste = taste;
    }
    public static void main(String[] args){
        Apple ap = new Apple();
        ap.eat("Apple", "Sweet");
        System.out.println("Name:"+ap.name+"\n"+"Taste:"+ ap.taste);
        Orange or =  new Orange();
        or.eat("Orange", "Sweet");
        System.out.println("Name:"+or.name+"\n"+"Taste:"+or.taste);
    }
}
