//package oops practice question;
abstract class Shape{
    abstract void drawShape();
}
class Square extends Shape{
    void drawShape(){
        System.out.println("Drawing a Square");
    }
}
class Circle extends Shape{
    void drawShape(){
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    void drawShape(){
        System.out.println("Drawing a Rectangle");
    }
}
class ShapeFactory{
    void drawShape(String type){
        if(type == "Square"){
            System.out.println("Drawing a Square");
        }
        else if(type == "Circle"){
            Circle c1 = new Circle();
            c1.drawShape();
            //System.out.println("Drawing a Circle");
        }
        else if(type == "Rectangle"){
            System.out.println("Drawing a Rectangle");
        }
        else{
            System.out.println("Drawing" +type+"is not supported");
        }
    }
}
public class shapeUse{
    public static void main(String[] args){
        Circle c = new Circle();
        Square s = new Square();
        c.drawShape();
        ShapeFactory f = new ShapeFactory();
        f.drawShape("Circle");

    }
}
