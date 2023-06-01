//Inheritance 1
public class Main1 {
    public static void main(String[] args){
        Bird bird = new Bird();
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
class Animal{
    public void eat(){
        System.out.println("The animal eats");
    }
    public void sleep(){
        System.out.println("The animal sleeps");
    }
}
class Bird extends Animal{
    public void eat(){
        System.out.println("The bird eats");
    }
    public void sleep(){
        System.out.println("The bird sleeps");
    }
    public void fly(){
        System.out.println("The bird flies");
    }
}