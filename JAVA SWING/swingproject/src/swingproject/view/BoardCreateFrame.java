package swingproject.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swingproject.dao.BoardDao;
import swingproject.domain.Board;

public class BoardCreateFrame extends JFrame {
	private static String customer_id; //技记
	private JPanel contentPane;
	private JTextField tfBoard_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardCreateFrame frame = new BoardCreateFrame(customer_id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BoardCreateFrame(String customer_id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Board Create");
		lblNewLabel.setFont(new Font("奔覆", Font.BOLD, 30));
		lblNewLabel.setBounds(110, 10, 249, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uBAA9");
		lblNewLabel_1.setBounds(40, 70, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfBoard_name = new JTextField();
		tfBoard_name.setBounds(120, 67, 302, 21);
		contentPane.add(tfBoard_name);
		tfBoard_name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_2.setBounds(40, 120, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JTextArea taBaord_content = new JTextArea();
		taBaord_content.setBounds(120, 115, 302, 90);
		contentPane.add(taBaord_content);
		
		JButton boardCreateBtn = new JButton("\uC791\uC131");
		boardCreateBtn.setBounds(120, 228, 97, 23);
		contentPane.add(boardCreateBtn);
		
		JButton cancelBtn = new JButton("\uCDE8\uC18C");
		cancelBtn.setBounds(229, 228, 97, 23);
		contentPane.add(cancelBtn);
		
		setVisible(true);
		
		boardCreateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Board board = new Board();
				board.setBoard_name(tfBoard_name.getText());
				board.setBoard_content(taBaord_content.getText());
				
				
				
				BoardDao dao = BoardDao.getInstance();
				int result = dao.create(board);
				
				if (result == 1) {
					JOptionPane.showMessageDialog(null, "积己 肯丰.");
					dispose();
					new BoardListFrame(customer_id);
				} else {
					JOptionPane.showMessageDialog(null, "积己 角菩");
					dispose();
					new BoardListFrame(customer_id);
				}
			}
		});		
		
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new BoardListFrame(customer_id);
				
			}
		});
	}
}
