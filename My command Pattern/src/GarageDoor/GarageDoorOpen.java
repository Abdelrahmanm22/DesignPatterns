package GarageDoor;

public class GarageDoorOpen implements Command{
	private GarageDoor GD;
	GarageDoorOpen(GarageDoor GD){
		this.GD=GD;
	}
	public void execute() {
		this.GD.turnUp();
	}
}
