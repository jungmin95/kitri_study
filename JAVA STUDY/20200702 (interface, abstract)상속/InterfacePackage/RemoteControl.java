package InterfacePackage;

public interface RemoteControl {
	
	public void changeVol(int vol);
	//update
	public default void setMute() {
		System.out.println("무음처리");
	}
}
