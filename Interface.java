import java.util.Scanner;
interface Shape {
    double area();
    double perimeter();
}
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Interface{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter length:");
        double length=scan.nextDouble();
        System.out.print("enter width:");
        double width=scan.nextDouble();
        System.out.print("enter radius:");
        double radius=scan.nextDouble();

        Shape rec= new Rectangle(length,width);
        System.out.println("rectangle area:"+ rec.area());
        System.out.println("rectangle perimeter:"+ rec.perimeter());
        
        

        Shape cir = new Circle(radius);
        System.out.println("Circle  area:"+ cir.area());
        System.out.println("Circle perimeter:"+ cir.perimeter());

    
    }
}


