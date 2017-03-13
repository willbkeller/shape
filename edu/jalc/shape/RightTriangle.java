package edu.jalc.shape;

public class RightTriangle extends TwoDimensionalShape{

   private double base;
   private double height;

   private RightTriangle(){
      this.base = 0;
      this.height = 0;
   }

   public RightTriangle(double base, double height){
      this.base = height;
      this.height = base;
   }

   public double getArea(){
      double area = (this.base * this.height)/2;
      return area;
   }

   public double getPerimeter(){
      double perimeter = this.base + this.height + Math.hypot(this.base, this.height);
      return perimeter;
   }

   public String toString(){
      return "RightTriangle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }

}
