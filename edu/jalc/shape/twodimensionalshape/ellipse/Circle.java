package edu.jalc.shape.twodimensionalshape.ellipse;

import edu.jalc.shape.twodimensionalshape.*;

public class Circle extends Ellipse{

  private double radius;

  private Circle(){
    super(0, 0);
  }

  public Circle(double radius){
    super(radius, radius);
    this.radius = radius;
  }

  public double getCircumference(){
    double circumference = 2 * Math.PI * (radius);
    return circumference;
  }

  public String toString(){
    return "Circle:\nArea = " + getArea() + "\nCircumference = " + getCircumference();
  }
}
