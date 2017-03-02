package edu.jalc.shape;

public class Circle extends Ellipse{

  private double radius;

  private Circle(){
    super(0, 0);
  }

  public Circle(double radius){
    super(radius, radius);
    this.radius = radius;
  }

  public double getPerimeter(){
    double perimeter = 2 * Math.PI * (radius);
    return perimeter;
  }

  public String toString(){
    return "Circle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
  }
}
