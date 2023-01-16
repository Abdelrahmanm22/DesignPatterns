package GarageDoor;

public class GarageDoorClose implements Command{
	private GarageDoor GD;
	GarageDoorClose(GarageDoor GD){
		this.GD=GD;
	}
	public void execute() {
		this.GD.turnDown();
	}
}
