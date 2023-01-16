package smartBoard;
import java.util.ArrayList;
public class smartBoard implements Subject{
	ArrayList <Observer> observers = new ArrayList<Observer>();
	boolean stat;

	@Override
	public void registerObserver(Observer O) {
		// TODO Auto-generated method stub
		observers.add(O);
	}

	@Override
	public void removeObserver(Observer O) {
		// TODO Auto-generated method stub
		observers.remove(0);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer:observers) {
			observer.update(stat);
		}
	}
	public void set_Stat(boolean stat){
		this.stat=stat;
		notifyObserver();
	}

}
