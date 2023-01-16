/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategycode;

/**
 *
 * @author future
 */
public class StrategyCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Duck d =new MallardDuck();
        d.performFly();
        
        d.setFlyBehavior(new FlyRocketPowered());
        d.performFly();
    }
    
}
