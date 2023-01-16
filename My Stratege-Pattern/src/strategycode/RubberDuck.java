/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategycode;

/**
 *
 * @author future
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        this.f=new FlyNoWay();
       
    }
    
    @Override
    void display(){
        System.out.println("I'm a rubber duckie");
    }
}
