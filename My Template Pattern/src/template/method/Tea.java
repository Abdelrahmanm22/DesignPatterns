/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method;

/**
 *
 * @author future
 */
public class Tea extends Beverage{
    @Override
    public void brew(){
        System.out.println("Steeping the Tea");
    }
    
    @Override
    public void add(){
        System.out.println("Adding Lemon");
    }
}
