package GarageDoor;

public class LightOffCommand implements Command{
	light l;
	LightOffCommand(light l){
		this.l=l;
	}
	public void execute() {
		this.l.turnOff();
	}
}
