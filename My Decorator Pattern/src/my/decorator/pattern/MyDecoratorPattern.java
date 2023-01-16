/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package my.decorator.pattern;

/**
 *
 * @author future
 */
public class MyDecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Beverage b1 = new HouseBlend();
        System.out.println(b1.getDescription() + " $" + b1.cost());
        
        
        Beverage b2 = new Espresso();
        b2 = new Soy(b2);
        b2 = new Milk(b2);
        System.out.println(b2.getDescription() + " $" + b2.cost());
        
        Beverage b3 = new Decaf();
        b3 = new Soy(b3);
        b3 = new Milk(b3);
        System.out.println(b3.getDescription() + " $" + b3.cost());
        
    }
    
}
