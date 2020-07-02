package InterfacePackage;

public class SamsungAudio extends Audio implements RemoteControl{
	
	
	@Override
	public void turnOn() {
		System.out.println("Audoio On");
	}
	
	@Override
	public void changeVol(int vol) {
		System.out.println("SamsungAudio : " + vol);
	}
}
