package swingTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingTable {
	
	JFrame frame = null;
	JTable table = null;
	JScrollPane panel = null;
	
	
	SwingTable() {
		frame = new JFrame();
		
		String[] columnName = {"stu_no" , "stu_name", "stu_dept"};
		String[][] data = {{"10", "yeo", "home"}, {"20", "hong", "josun"}};
		
		table = new JTable(data, columnName);
		panel = new JScrollPane(table);
		
		frame.add(panel);
		frame.setSize(500, 300);
		frame.setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		new SwingTable();
		
		
		
	}
	
}
