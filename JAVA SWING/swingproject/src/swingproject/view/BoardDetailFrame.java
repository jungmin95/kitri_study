package swingproject.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swingproject.dao.BoardDao;
import swingproject.domain.Board;

public class BoardDetailFrame extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField, tfBoard_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private Board board;

			public void run() {
				try {
					BoardDetailFrame frame = new BoardDetailFrame(board);
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
	public BoardDetailFrame(Board board) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final int board_no = board.getBoard_no();
		
		JLabel lblNewLabel = new JLabel("Board Create");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel.setBounds(110, 10, 249, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uBAA9");
		lblNewLabel_1.setBounds(40, 70, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfBoard_name = new JTextField();
		textField.setColumns(10);
		textField.setBounds(120, 67, 302, 21);
		contentPane.add(tfBoard_name);
		
		JLabel lblNewLabel_2 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_2.setBounds(40, 120, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JTextArea taBoard_content = new JTextArea();
		taBoard_content.setBounds(120, 115, 302, 90);
		taBoard_content.setRows(5);
		contentPane.add(taBoard_content);
		
		JButton updateBtn = new JButton("\uC218\uC815");
		updateBtn.setBounds(110, 228, 97, 23);
		updateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BoardDao dao = new BoardDao();
				Board board = new Board();
				
				String board_name = tfBoard_name.getText();
				String board_content = taBoard_content.getText();
				
				board.setBoard_name(tfBoard_name.getText());
				board.setBoard_content(taBoard_content.getText());
				
				dao.updateBoard(board);
				
				setVisible(false);
				System.out.println("board_name : " + board_name);
				System.out.println("board_content : " + board_content);
				
			}
		});
		contentPane.add(updateBtn);
		
		JButton deleteBtn = new JButton("\uC0AD\uC81C");
		deleteBtn.setBounds(219, 228, 97, 23);
		contentPane.add(deleteBtn);
		
		JButton cancelBtn = new JButton("\uCDE8\uC18C");
		cancelBtn.setBounds(328, 228, 97, 23);
		contentPane.add(cancelBtn);
		
		
	}

}
