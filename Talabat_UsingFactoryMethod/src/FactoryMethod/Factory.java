package FactoryMethod;

public class Factory {

	//factory Method
	public Option viewOption(String option) {
		if(option.equals("runner")) {
			return new Runner();
		}else if(option.equals("drive")) {
			return new Drive_thru();
		}else
			return null;
	}
}
