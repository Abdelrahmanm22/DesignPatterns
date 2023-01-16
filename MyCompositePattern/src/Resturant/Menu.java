package Resturant;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList<MenuComponent> menuComponents= new ArrayList<MenuComponent> ();
	String name;
	String dsecription;
//	double price;
	
	public Menu(String name, String dsecription) {
		super();
		this.name = name;
		this.dsecription = dsecription;
//		this.price = price;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n"+getName());
		System.out.print(","+getDesc());
//		System.out.println(","+getPrice());
		System.out.println("-------------------");
		Iterator<MenuComponent> iterator =menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent mc =iterator.next();
			mc.print();
		}
		
	}
	public  MenuComponent getMenuComp(int index) {
		return (MenuComponent) menuComponents.get(index);
	}
	public  void add(MenuComponent mc) {
		menuComponents.add(mc);
	}
	public  void remove(MenuComponent mc) {
		menuComponents.remove(mc);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return dsecription;
	}

	
	
}
