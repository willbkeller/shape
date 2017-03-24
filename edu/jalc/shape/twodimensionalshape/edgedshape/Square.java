package edu.jalc.shape.twodimensionalshape.edgedshape;

import edu.jalc.shape.twodimensionalshape.*;

public class Square extends Rectangle{

   private Square(){
      super(0, 0);
   }

   public Square(double side){
      super(side, side);
   }
   

   public String toString(){
      return "Square:\nArea = " + getArea() + "\nPerimeter = " + getPerimeter();
   }
}
