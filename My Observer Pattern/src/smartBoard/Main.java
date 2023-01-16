package smartBoard;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartBoard s = new smartBoard();
		TV t = new TV(s);
		washingMachine wm = new washingMachine(s);
		s.set_Stat(false);
		
		s.removeObserver(t);
		s.set_Stat(true);
	}

}
