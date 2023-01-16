/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.decorator.pattern;

/**
 *
 * @author future
 */
public class Soy extends Decorator{

    
    public Soy(Beverage beverag){
        this.beverage = beverag;
    }
    
    @Override
    public String getDescription()
    {
        return beverage.getDescription()+", Soy";
    }
    @Override
    public double cost(){
        return beverage.cost()+2.0;
    }
}
