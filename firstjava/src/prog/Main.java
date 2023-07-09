package prog;

public class Main {
  public static void main(String args[]) {
    Rectangle rectangle = new Rectangle(10, 40);

    double rectangle_area = rectangle.calculateArea();

    rectangle.getLength();
    rectangle.getBredth();

    System.out.println("The area of Rectangle is: " + rectangle_area);

    Circle circle = new Circle(20);

    double circle_area = circle.calculateArea();

    circle.getRadius();

    System.out.println("The area of Circle is: " + circle_area);

  }
}
