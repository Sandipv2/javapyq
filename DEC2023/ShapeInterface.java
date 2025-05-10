interface Shape {
    void getArea();
}

class Rectangle implements Shape{
    double l,w;
    public void getArea() {
        double area = l*w;
        System.out.println("Rectangle area: "+area);
    }

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
}

class Circle implements Shape{
    double r;
    public void getArea() {
        double area = 3.14 * r * r;
        System.out.println("Circle area: "+area);
    }

    public Circle(double r) {
        this.r = r;
    }
}

class Triangle implements Shape {
    double b;
    double h;

    public void getArea() {
        double area = 0.5 * b * h;
        System.out.println("Triangle area: "+area);
    }

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(12.5, 10);
        Circle cr = new Circle(4);
        Triangle tr = new Triangle(10, 15);

        rec.getArea();
        cr.getArea();
        tr.getArea();
    }
}
