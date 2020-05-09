/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3.ShapeFactory;

import bt3.Shape.Circle.Circle;
import bt3.Shape.Rectangle.Rectangle;
import bt3.Shape.Shape;
import bt3.Shape.ShapeType;
import bt3.Shape.Triangle.Triangle;

/**
 *
 * @author Laptop
 */
public class ShapeFactory {

    public ShapeFactory() {
    }
    
   public Shape createShape(ShapeType type)
   {
       switch(type)
       {
           case rectangle : return Rectangle.createInstance();
           case triangle : return Triangle.createInstance();
           case circle : return Circle.createInstance();
       }
       return null;
   }
}
