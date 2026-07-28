
class Square {
    double length;
    double result;

    Square(double l){
        this.length = l;
    }


    double area(){
        result = 4 * length;
        return  result;
    }
}

class Rectangle {
    double width;
    double length;
    double result;

    Rectangle(double w, double len){
        this.width = w;
        this.length = len;
    }

    double area () {
        result = width * length;
        return result;
    }

}

class Triangle {
    double base;
    double height;
    double result;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    double area(){
        result = (base * height) / 2;
        return result;
    }

}

class Circle {
    double radius;
    double result;

    Circle (double radius){
        this.radius = radius;
    }

    double area(){
        result = Math.PI * (radius * radius);
        return result;
    }

}

public class Area {

    static Circle circle;


    public static void main(String[] args) {

        System.out.println(" This all about calculation of a Area of Shapes !!! ");
        

        Circle c = new Circle(5.5);
        Triangle t = new Triangle(6, 4.5);
        Rectangle r = new Rectangle(7, 8.0);
        Square s = new Square(8);


        System.out.println("This is the area of a circle " + "Circle = " + c.area());
        System.out.println("This is the area of a triangle " + "Triangle = " + t.area());
        System.out.println("This is the area of a circle " + "Rectangle = " + r.area());
        System.out.println("This is the area of a circle " + "Square = " + s.area());

    }
}
