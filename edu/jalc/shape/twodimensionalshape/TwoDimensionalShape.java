package edu.jalc.shape.twodimensionalshape;

import edu.jalc.shape.*;

abstract public class TwoDimensionalShape extends Shape{

   abstract public double getArea();
   
   abstract public String toString();
   
   public boolean equals(TwoDimensionalShape shape){
      return this.getArea() == shape.getArea();
   }
}
