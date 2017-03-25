package edu.jalc.shape.twodimensionalshape.edgedshape;

import edu.jalc.shape.twodimensionalshape.*;

public class RightTriangle extends EdgedShape{

   private double width;
   private double height;

   private RightTriangle(){
      super(0,0);
   }

   public RightTriangle(double width, double height){
      super(width, height);
      this.width = width;
      this.height = height;
   }

   public double getArea(){
      double area = (this.width * this.height)/2;
      return area;
   }

   public double getPerimeter(){
      double perimeter = this.width + this.height + Math.hypot(this.width, this.height);
      return perimeter;
   }

   public String toString(){
      return "RightTriangle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }

}
