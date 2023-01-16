package smartBoard;

public class airConditioner implements Observer{
	boolean stat;
	smartBoard s;
	
	airConditioner(smartBoard s){
		this.s=s;
		s.registerObserver(this);
	}

	public void update(boolean stat) {
		// TODO Auto-generated method stub
		this.stat=stat;
		if(stat==true) {
			System.out.println("Now,air Conditioner is on");
		}else {
			System.out.println("Now,air Conditioner is off");
		}
	}
}
