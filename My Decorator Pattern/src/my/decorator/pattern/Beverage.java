/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.decorator.pattern;

/**
 *
 * @author future
 */
public abstract class Beverage {
    String description ;
    Beverage(){
        description = "Unknown Beverage";
    }
    public String getDescription()
    {
        return description;
    }
    public abstract double cost();
    
}
