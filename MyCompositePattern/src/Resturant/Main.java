package Resturant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent pancakeHouseMenu = 
				new Menu("PANCAKE HOUSE MENU", "Breakfast"); 
			MenuComponent dinerMenu = 
				new Menu("DINER MENU", "Lunch");
			MenuComponent cafeMenu = 
				new Menu("CAFE MENU", "Dinner");
			MenuComponent dessertMenu = 
				new Menu("DESSERT MENU", "Dessert of course!");
			MenuComponent coffeeMenu = new Menu("COFFEE MENU", "Stuff to go with your afternoon coffee");
	  
			MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
	  
			allMenus.add(pancakeHouseMenu);
			allMenus.add(dinerMenu);
			allMenus.add(cafeMenu);
	  
			pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast",2.99));
			pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",2.99));
			pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes","Pancakes made with fresh blueberries, and blueberry syrup",3.49));
			pancakeHouseMenu.add(new MenuItem("Waffles","Waffles with your choice of blueberries or strawberries",3.59));
			dinerMenu.add(new MenuItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat", 2.99));
			dinerMenu.add(new MenuItem("BLT","Bacon with lettuce & tomato on whole wheat",2.99));
			dinerMenu.add(new MenuItem("Soup of the day","A bowl of the soup of the day, with a side of potato salad",3.29));
			dinerMenu.add(new MenuItem("Hot Dog","A hot dog, with saurkraut, relish, onions, topped with cheese",3.05));
			dinerMenu.add(new MenuItem("Steamed Veggies and Brown Rice","Steamed vegetables over brown rice",		3.99));
			dinerMenu.add(new MenuItem("Pasta","Spaghetti with marinara sauce, and a slice of sourdough bread",3.89));
	   
			dinerMenu.add(dessertMenu);
			dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla icecream",1.59));
	  
			dessertMenu.add(new MenuItem("Cheesecake","Creamy New York cheesecake, with a chocolate graham crust",1.99));
			dessertMenu.add(new MenuItem("Sorbet","A scoop of raspberry and a scoop of lime",1.89));

			cafeMenu.add(new MenuItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun, lettuce, tomato, and fries",3.99));
			cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day, with a side salad",3.69));
			cafeMenu.add(new MenuItem("Burrito","A large burrito, with whole pinto beans, salsa, guacamole",4.29));

			cafeMenu.add(coffeeMenu);

			coffeeMenu.add(new MenuItem("Coffee Cake","Crumbly cake topped with cinnamon and walnuts",1.59));
			coffeeMenu.add(new MenuItem("Bagel","Flavors include sesame, poppyseed, cinnamon raisin, pumpkin",0.69));
			coffeeMenu.add(new MenuItem("Biscotti","Three almond or hazelnut biscotti cookies",0.89));
			
			allMenus.print();
	}

}
