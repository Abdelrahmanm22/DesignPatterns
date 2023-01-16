/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.factory.method;

/**
 *
 * @author future
 */
public class ChicagoStyleVeggiePizza extends Pizza{
    
    public ChicagoStyleVeggiePizza() {
	name = "Chicago Deep Dish Veggie Pizza";
	dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        
	toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
	toppings.add("Spinach");
        toppings.add("Eggplant");

    }
}
