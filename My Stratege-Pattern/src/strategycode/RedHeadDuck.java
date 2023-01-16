/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategycode;

/**
 *
 * @author future
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        this.f= new FlyWithWings();
    }
    
    
    @Override
    void display(){
        System.out.println("I'm a Red Headed duck");
    }
}
