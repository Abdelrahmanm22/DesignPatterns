/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategycode;

/**
 *
 * @author future
 */
public abstract class Duck {
    
    flyable f;
    
    public void setFlyBehavior(flyable fb) {
		this.f = fb;
    }
    public void performFly() {
    	f.fly();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    
    abstract void display();
    
    
}
