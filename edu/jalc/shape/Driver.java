package edu.jalc.shape;

import java.util.ArrayList;
import edu.jalc.shape.twodimensionalshape.*;
import edu.jalc.shape.twodimensionalshape.edgedshape.*;
import edu.jalc.shape.twodimensionalshape.ellipse.*;

public class Driver{

   public static void main(String[] args){
     ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();

     shapes.add(new Rectangle(3, 2));
     shapes.add(new Square(3));
     shapes.add(new RightTriangle(3, 4));
     shapes.add(new Ellipse(1, 3));
     shapes.add(new Circle(1));

     for(TwoDimensionalShape s : shapes){
       System.out.println(s.toString());
       System.out.println();
     }
     
     System.out.println(shapes.get(0).equals(shapes.get(1)));
     System.out.println(shapes.get(3).equals(shapes.get(4)));
     System.out.println(shapes.get(2).equals(shapes.get(0)));    
   }
}
