/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategycode;

/**
 *
 * @author future
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
        f= new FlyWithWings();
    }
    @Override
    void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
