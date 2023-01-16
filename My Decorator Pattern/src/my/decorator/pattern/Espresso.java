/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.decorator.pattern;

/**
 *
 * @author future
 */
public class Espresso extends Beverage{
    Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost(){
        return 3.0;
    }
}
