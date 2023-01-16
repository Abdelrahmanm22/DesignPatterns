package Resturant;

import java.nio.channels.UnsupportedAddressTypeException;

public abstract class MenuComponent {

	public  void add(MenuComponent mc) {
		throw new UnsupportedOperationException();
	}
	public  void remove(MenuComponent mc) {
		throw new UnsupportedOperationException();
	}
	public  MenuComponent getMenuComp(int index) {
		throw new UnsupportedOperationException();
	}
	public abstract void print();
	public abstract String getName();
	public abstract String getDesc();
	public  double getPrice() {
		throw new UnsupportedOperationException();
	}
	
}
