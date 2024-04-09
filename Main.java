import Geometry.Circle;
import Geometry.Point2;

public class Main {
public static void main(String[] args){
    Point2 point = new Point2(7.0,10.0);
    System.out.printf("wartość x: %s, wartosć y: %s",point.getX(),point.getY());
    
    Circle circle = new Circle(15.0,point);
    System.out.println();
    System.out.printf("wartość radius %s, wartość center %s",circle.getRadius(),circle.getCenter().getShortInfo());

    
}
}
