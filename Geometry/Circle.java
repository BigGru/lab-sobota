package Geometry;

public class Circle {
    private double radius;
    private Point2 center;
    public Circle(double radius, Point2 center){
        this.radius = radius;
        this.center = center;
    }
    public Point2 getCenter(){
        return this.center;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setCenter(Point2 newCenter){
        this.center = newCenter;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radius; 
    }
    

}
