package kitristudy20200702;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int setChannel() {
		
	}
	int getChannel( ) {
		
	}
	int setVolume() {
		
	}
	int getVolume() {
		
	}
}

class Exercise1 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());
	}
}
