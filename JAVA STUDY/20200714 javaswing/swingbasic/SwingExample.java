package swingbasic;

import javax.swing.*;

public class SwingExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		JButton button = new JButton("¹öÆ°");
		button.setBounds(0, 0, 50, 50);
		
		
		JPanel panel = new JPanel();
		panel.add(button);
		frame.add(panel);
		
		
		frame.setVisible(true);

	}

}
