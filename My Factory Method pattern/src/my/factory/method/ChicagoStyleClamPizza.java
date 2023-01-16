/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.factory.method;

/**
 *
 * @author future
 */
public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza() {
	name = "Chicago Style Clam Pizza";
	dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
	toppings.add("Frozen Clams from Chesapeake Bay");
    }
}
