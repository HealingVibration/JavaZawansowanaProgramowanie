package Day2;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(3,4);
        Point2D point = new Point2D(18, 9);
        Circle circle = new Circle(center,point);
        MoveDirection moveDirection = new MoveDirection(7,8);

        circle.getRadius();
        circle.getArea();
        circle.getPerimeter();

        System.out.println(center.getX());

        circle.move(moveDirection);

        System.out.println(center.getX());
        System.out.println("stary X" + center.getX());
        System.out.println("stary Y " + center.getY());
        System.out.println(circle.resize(10));


        System.out.println("new obwód =" + " " + circle.resize(10));

    }
}
