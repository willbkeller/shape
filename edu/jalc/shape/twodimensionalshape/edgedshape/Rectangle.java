package edu.jalc.shape.twodimensionalshape.edgedshape;

import edu.jalc.shape.twodimensionalshape.*;

public class Rectangle extends EdgedShape{

   private double height;
   private double width;

   private Rectangle(){
      super(0,0);
   }

   public Rectangle(double height, double width){
      super(height,width);
      this.height = height;
      this.width = width;
   }

   public String toString(){
      return "Rectangle:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }

}
