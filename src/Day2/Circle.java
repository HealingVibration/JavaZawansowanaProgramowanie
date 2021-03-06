package Day2;

import java.util.List;

public class Circle implements Movable, Resizeable {
    Point2D center;
    Point2D point;
    public Circle(Point2D center, Point2D point){
        this.center = center;
        this.point = point;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double getRadius(){
        double pomocniczapow= Math.pow(point.getX() - center.getX(), 2);
        double pomocniczapowy = Math.pow(point.getY() - center.getY(), 2);
        double r = Math.sqrt(pomocniczapow + pomocniczapowy);

        System.out.println("promień to r");
        return r;
    }

    public double getPerimeter(){
        double perimeter = Math.PI*2*getRadius();
        System.out.println("obwód to = perimeter");
        return perimeter;
    }


    public double getArea(){
        double area = Math.PI*Math.pow(getRadius(), 2);
        System.out.println("pole to " +  area);
        return area;
    }


    @Override
    public void move(MoveDirection moveDirection){
        center.move(moveDirection);
    }

    @Override
    public double resize(double reSizeFactor) {
        double newSize;
        double oldSize;
        double newRadius;
        newSize = getPerimeter()*reSizeFactor;
        newRadius = newSize/Math.PI*2;

        double newX = (((point.getX() -  center.getX()) * newRadius /getRadius()) + center.getX());
        double newY = (((point.getY() -  center.getY()) * newRadius /getRadius()) + center.getY());
        System.out.println("nowy x"  + newX);
        System.out.println("nowy y" + newY);

        System.out.println(getRadius() + " nowy r" + getRadius()*reSizeFactor + "stare r * wspolczynnik");
        System.out.println("stary r" + getRadius()*reSizeFactor*2*Math.PI);
      return newSize;

    }


    // public List getSlicePoints(){

      //  x = r*cos(kat)
       // y = r*sin(kat)

    //}

}
