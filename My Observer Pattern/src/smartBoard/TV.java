package smartBoard;

public class TV implements Observer{
	boolean stat;
	smartBoard s;
	
	TV(smartBoard s){
		this.s=s;
		s.registerObserver(this);
	}

	public void update(boolean stat) {
		// TODO Auto-generated method stub
		this.stat=stat;
		if(stat==true) {
			System.out.println("Now,Tv is on");
		}else {
			System.out.println("Now,Tv is off");
		}
	}
	

}
