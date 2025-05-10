abstract class Shape {
    abstract void calculateArea();
    abstract void calculateVolume();
}

class Sphere extends Shape {
    double r;
    public void calculateArea() {
        double area = 4 * 3.14 * (r*r);
        System.out.println("Sphere area: "+area);
    }

    public void calculateVolume() {
        double volume = (4/3) * 3.14 * (r*r*r);
        System.out.println("Sphere volume: "+volume);
    }

    public Sphere(double r) {
        this.r = r;
    }
}

class Cone extends Shape {
    double h;
    double r;
    double l;
    public void calculateArea() {
        double area = 3.14 * r * (r + l);
        System.out.println("Cone area: "+area);
    }

    public void calculateVolume() {
        double volume = (1/3f) * 3.14 * (r*r) * h;
        System.out.println("Cone volume: "+volume);
    }

    public Cone(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }
}

class Cylinder extends Shape {
    double r;
    double h;

    public void calculateArea() {
        double area = 2 * 3.14 * r * (r + h);
        System.out.println("Cylinder area: "+area);
    }

    public void calculateVolume() {
        double volume = 3.14 * r * r * h;
        System.out.println("Cylinder volume: "+volume);
    }

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
}

public class ShapeAbstract {
    public static void main(String[] args) {
        Cone c = new Cone(3.5, 4, 6);
        Sphere s = new Sphere(4.5);
        Cylinder cy = new Cylinder(5, 7);

        c.calculateArea();
        c.calculateVolume();

        s.calculateArea();
        s.calculateVolume();

        cy.calculateArea();
        cy.calculateVolume();

    }
}