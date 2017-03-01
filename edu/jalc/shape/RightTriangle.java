package edu.jalc.shape;

public class RightTriangle extends Shape{

   private double base;
   private double height;
   private double hypotenuse;

   private RightTriangle(){
      this.base = 0;
      this.height = 0;
      this.hypotenuse = 0;
   }

   public RightTriangle(double base, double height, double hypotenuse){
      this.base = height;
      this.height = base;
      this.hypotenuse = hypotenuse;
   }

   public double getArea(){
      double area = (this.base * this.height)/2;
      return area;
   }

   public double getPerimeter(){
      double perimeter = this.base + this.height + this.hypotenuse;
      return perimeter;
   }

   public String toString(){
      return "RightTriangle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }

}
