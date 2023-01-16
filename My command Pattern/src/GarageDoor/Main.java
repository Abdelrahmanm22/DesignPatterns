package GarageDoor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new RemoteControl();
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpen garageDoorOpen=new GarageDoorOpen(garageDoor);
		GarageDoorClose garageDoorClose = new GarageDoorClose(garageDoor);
		
		remoteControl.addCommand(0, garageDoorOpen, garageDoorClose);
		remoteControl.onButtonPress(0);
		remoteControl.offButtonPress(0);
		
		light l =new light();
		LightOffCommand lightOffCommand=new LightOffCommand(l);
		LightOnCommand lightOnCommand = new LightOnCommand(l);
		
		remoteControl.addCommand(1, lightOnCommand, lightOffCommand);
		remoteControl.onButtonPress(1);
		remoteControl.offButtonPress(1);
		
	}

}
