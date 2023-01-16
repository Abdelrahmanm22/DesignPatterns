/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategycode;

/**
 *
 * @author future
 */
public class DecoyDuck extends Duck{
    public DecoyDuck(){
        this.f=new FlyRocketPowered();
    }
    
    @Override
    void display(){
        System.out.println("I'm a duck Decoy");
    }
}
