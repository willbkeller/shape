package edu.jalc.shape.twodimensionalshape;

import edu.jalc.shape.*;

abstract public class TwoDimensionalShape extends Shape{

   abstract public double getArea();
   
   abstract public double getPerimeter();
   
   abstract public String toString();
   
   public String equals(TwoDimensionalShape shape){
      String answer = null;
      if(this.getArea() == shape.getArea()){answer = "Shapes's areas are equal";}
      else{answer = "Shapes's areas are not equal";}
      return answer;
   }
}
