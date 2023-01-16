package Resturant;

public class MenuItem extends MenuComponent{
	String name;
	String dsecription;
	double price;
	public MenuItem(String name, String dsecription, double price) {
		super();
		this.name = name;
		this.dsecription = dsecription;
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println(getName());
		System.out.println(getDesc());
		System.out.println(getPrice());
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

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	
}
