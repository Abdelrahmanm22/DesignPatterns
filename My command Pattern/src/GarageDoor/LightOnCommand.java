package GarageDoor;

public class LightOnCommand implements Command{
	light l;
	LightOnCommand(light l){
		this.l=l;
	}
	public void execute() {
		this.l.turnOn();
	}
}
