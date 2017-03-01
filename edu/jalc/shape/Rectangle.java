package edu.jalc.shape;

public class Rectangle extends Shape{

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
      double area = this.base * this.height;
      return area;
   }

   public double getPerimeter(){
      double perimeter = (2*this.base) + (2*this.height);
      return perimeter;
   }

   public String toString(){
      return "Rectangle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }

}
