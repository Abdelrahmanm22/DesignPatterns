package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f =new Factory();
		Option option = f.viewOption("runner");
		System.out.println(option.calculateFees());
	}
}
