//Overriding and polymorphism 2
class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }

    public void erase() {
        System.out.println("Erasing shape");
    }
}
    class Circle extends Shape {
        public void draw(){
            System.out.println("Drawing circle");
        }
        public void erase(){
            System.out.println("Erasing Circle");
        }
    }
    class Triangle extends Shape{
        public void draw() {
            System.out.println("Drawing triangle");
        }
        public void erase(){
            System.out.println("Erasing triangle");
        }
    }
    class Square extends Shape{
        public void draw(){
            System.out.println("Drawing sqaure");
        }
        public void erase(){
            System.out.println("Erasing square");
        }
    }

public class Main2{
    public static void main(String[] args){
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();

    }
}


