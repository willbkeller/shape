package edu.jalc.shape;

import java.util.ArrayList;

public class Driver{

   public static void main(String[] args){
     ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();

     shapes.add(new Rectangle(4, 5));
     shapes.add(new Square(3));
     shapes.add(new RightTriangle(3, 4, 5));
     shapes.add(new Ellipse(1, 3));
     shapes.add(new Circle(1));

     for(TwoDimensionalShape s : shapes){
       System.out.println(s.toString());
     }
   }
}
