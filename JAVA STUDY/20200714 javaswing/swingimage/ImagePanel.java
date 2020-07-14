package swingimage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private Image image;
	
	ImagePanel(Image image) {
		this.image = image;
		setSize(new Dimension(image.getWidth(null), image.getHeight(null)));
		setLayout(null);
	}
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(image,0,0,null);
		
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Image Panel");
		

		
		ImagePanel panel = new ImagePanel(new ImageIcon("c:/test/prosche.jpg").getImage());
		
		frame.add(panel);
		frame.setSize(800, 800);
		frame.setVisible(true);
		
	}

}
