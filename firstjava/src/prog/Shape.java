package prog;
class Shape {
  private double area;

  public Shape(double area) {
    this.area = area;
  }

  public double calculateArea() {
    return area;
  }
}

class Rectangle extends Shape {
  private double length;
  private double bredth;

  public Rectangle(double length, double bredth) {
    super(length * bredth);

    this.length = length;
    this.bredth = bredth;
  }

  public double calculateArea() {
    return super.calculateArea();
  }

  public double getLength() {
    return this.length;
  }

  public double getBredth() {
    return this.bredth;
  }
}

class Circle extends Shape {
  private double radius;
  private static double pi = 3.14;

  public double calculateArea() {
    return super.calculateArea();
  }

  public Circle(double radius) {
    super(pi * radius * radius);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }
}