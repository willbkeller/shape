package edu.jalc.shape.twodimensionalshape.ellipse;

import edu.jalc.shape.twodimensionalshape.*;

public class Ellipse extends TwoDimensionalShape{

  private double majorAxis;
  private double minorAxis;

  private Ellipse(){
    this.majorAxis = 0;
    this.minorAxis = 0;
  }

  public Ellipse(double majorAxis, double minorAxis){
    this.majorAxis = majorAxis;
    this.minorAxis = minorAxis;
  }

  public double getArea(){
    double area = 2 * Math.PI * (majorAxis * minorAxis);
    return area;
  }

  public double getPerimeter(){
    double perimeter = 2 * Math.PI *(Math.sqrt((Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2))/2));
    return perimeter;

  }
  public String toString(){
    return "Ellipse:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
  }
}
