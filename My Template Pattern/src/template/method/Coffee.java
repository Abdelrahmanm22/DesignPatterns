/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method;

/**
 *
 * @author future
 */
public class Coffee extends Beverage{
    
    @Override
    public void brew(){
        System.out.println("Dripping Coffe through filter");
    }
    
    @Override
    public void add(){
        System.out.println("Adding Sufgar and Milk");
    }
    
    
}
