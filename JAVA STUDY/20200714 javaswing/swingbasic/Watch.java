package swingbasic;

import java.util.Calendar;

import javax.swing.*;

public class Watch implements Runnable{
	
	JFrame frame = null;
	JButton button = null;
	Thread thread = null;
	
	String timestring = null;
	int hour, min, sec = 0;
	
	Watch() {

		
		frame = new JFrame("Digital Watch");
		button = new JButton();
		button.setBounds(100, 100, 100, 50);
		
		frame.add(button);
		frame.setSize(300, 250);
		frame.setLayout(null);
		frame.setVisible(true);
		
		thread = new Thread(this);
		thread.start();
	}
	
	
	
	
	@Override
	public void run() {
		
		while(true) {
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		sec = cal.get(Calendar.SECOND);
		timestring = hour + " : " + min + " : " + sec;
		
		button.setText(timestring);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {
		Watch watch = new Watch();
		System.out.println(watch.timestring);

	}

}
