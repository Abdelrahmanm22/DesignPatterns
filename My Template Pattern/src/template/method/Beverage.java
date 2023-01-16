/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method;

/**
 *
 * @author future
 */
public abstract class Beverage {
    final public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        add();
    }
    public void boilWater(){
        System.out.println("Boiling Water");
    }
    abstract public void brew();
    
    public void pourInCup(){
        System.out.println("Pouring into Cup");
    }
    abstract public void add();
}
