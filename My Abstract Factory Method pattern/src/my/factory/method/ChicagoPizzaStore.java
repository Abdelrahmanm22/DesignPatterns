/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.factory.method;

/**
 *
 * @author future
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public  Pizza createPizza(String type){
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
       	    return new ChicagoStyleVeggiePizza();
       	} else if (type.equals("clam")) {
       	    return new ChicagoStyleClamPizza();
       	} else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
