/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.decorator.pattern;

/**
 *
 * @author future
 */
public class Milk extends Decorator{
    public Milk(Beverage beverage){
        this.beverage = beverage;  
    }
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+", Milk";
    }
    @Override
    public double cost(){
        return beverage.cost()+2.3;
    }
}
