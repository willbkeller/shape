package edu.jalc.shape;

public class Rectangle extends TwoDimensionalShape{

   private double height;
   private double base;

   private Rectangle(){
      this.height = 0;
      this.base = 0;
   }

   public Rectangle(double height, double base){
      this.height = height;
      this.base = base;
   }

   public double getArea(){
      double area = base * height;
      return area;
   }

   public double getPerimeter(){
      double perimeter = (2 * base) + (2 * height);
      return perimeter;
   }

   public String toString(){
      return "Rectangle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }

}
