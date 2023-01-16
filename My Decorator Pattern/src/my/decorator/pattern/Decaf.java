/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.decorator.pattern;

/**
 *
 * @author future
 */
public class Decaf extends Beverage{
    Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost(){
        return 1.8;
    }
}
