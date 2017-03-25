package edu.jalc.shape.twodimensionalshape.edgedshape;

import edu.jalc.shape.twodimensionalshape.*;

abstract class EdgedShape extends TwoDimensionalShape{

   private double height;
   private double width;
   
   private EdgedShape(){
      this.height = 0;
      this.width = 0;
   }
   
   public EdgedShape(double height, double width){
      this.height = height;
      this.width = width;
   }

   public double getPerimeter(){
      double perimeter = (2 * width) + (2 * height);
      return perimeter;
   }
   
   public double getArea(){   
      double area = width * height;
      return area;
   }

}
