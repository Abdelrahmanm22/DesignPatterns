package smartBoard;

public class washingMachine implements Observer{
	boolean stat;
	smartBoard s;
	
	washingMachine(smartBoard s){
		this.s=s;
		s.registerObserver(this);
	}

	public void update(boolean stat) {
		// TODO Auto-generated method stub
		this.stat=stat;
		if(stat==true) {
			System.out.println("Now,washing Machine is on");
		}else {
			System.out.println("Now,washing Machine is off");
		}
	}
}
