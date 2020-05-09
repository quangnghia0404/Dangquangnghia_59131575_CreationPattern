/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import bt3.Shape.Shape;
import bt3.Shape.ShapeType;
import bt3.ShapeFactory.ShapeFactory;

/**
 *
 * @author Laptop
 */
public class bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory SFac = new ShapeFactory();
        
        Shape SF1 = SFac.createShape(ShapeType.circle);
        Shape SF2 = SFac.createShape(ShapeType.circle);
        Shape SF3 = SFac.createShape(ShapeType.triangle);
        Shape SF4 = SFac.createShape(ShapeType.triangle);
        Shape SF5 = SFac.createShape(ShapeType.rectangle);
        Shape SF6 = SFac.createShape(ShapeType.rectangle);
        
        SF1.setCount(10);
        SF2.setCount(20);
        
        SF3.setCount(30);
        SF4.setCount(40);
        
        SF5.setCount(50);
        SF6.setCount(60);
        
        System.out.println("Hình tròn thứ nhất có count :"+SF1.getCount());
        System.out.println("Hình tròn thứ hai có count :"+SF2.getCount());
        
        System.out.println("Hình chữ nhật thứ nhất có count :"+SF3.getCount());
        System.out.println("Hình chữ nhật thứ hai có count :"+SF4.getCount());
        
        System.out.println("Hình tam giác thứ nhất có count :"+SF5.getCount());
        System.out.println("Hình tam giác thứ hai có count :"+SF6.getCount());
    }
    
}
