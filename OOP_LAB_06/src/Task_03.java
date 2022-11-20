public class Task_03 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(1.2, 2.3, "brown");
        System.out.println("Volume of Cylinder in float: " + c1.getVolume());
        System.out.println("Volume of Cylinder in int: " + (int)c1.getVolume());
        System.out.println("Area of Circle in float: " + (c1.getArea()));
        System.out.println("Area of Circle in int: " + (int)c1.getArea());
    }
}

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Circle() { }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    double getArea() {
        return (float) (3.142*radius*radius);
    }

    public String toString() {
        return "aa";
    }
}

class Cylinder extends Circle{
    private double height = 1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Cylinder() { }
    Cylinder(double height) {
        this.height = height;
    }
    Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    double getVolume() {
        return (float) (3.142*getRadius()*getRadius()*height);
    }
}
