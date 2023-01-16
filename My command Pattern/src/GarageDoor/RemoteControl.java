package GarageDoor;

public class RemoteControl {
	private Command[] onCommand;
	private Command[] offCommand;
	RemoteControl(){
		onCommand = new Command[2];
		offCommand = new Command[2];
	}
	
	public void addCommand(int slot,Command onCommand,Command offCommand) {
		this.onCommand[slot]=onCommand;
		this.offCommand[slot]=offCommand;
	}
	public void onButtonPress(int slot) {
		onCommand[slot].execute();
	}
	public void offButtonPress(int slot) {
		offCommand[slot].execute();
	}
}
