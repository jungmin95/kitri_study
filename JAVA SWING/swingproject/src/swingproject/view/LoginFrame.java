package swingproject.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import swingproject.dao.MemberDAO;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfCustomer_id;
	private JTextField tfCustomer_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//id
		tfCustomer_id = new JTextField();
		tfCustomer_id.setBounds(129, 113, 116, 21);
		contentPane.add(tfCustomer_id);
		tfCustomer_id.setColumns(10);
		
		
		//패스워드
		tfCustomer_pw = new JTextField();
		tfCustomer_pw.setBounds(129, 179, 116, 21);
		contentPane.add(tfCustomer_pw);
		tfCustomer_pw.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(47, 116, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("pw");
		lblNewLabel_1.setBounds(47, 182, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(47, 34, 330, 46);
		contentPane.add(lblNewLabel_2);
		
		JButton loginBtn = new JButton("\uB85C\uADF8\uC778");
		loginBtn.setBounds(302, 112, 97, 23);
		contentPane.add(loginBtn);
		
		JButton joinBtn = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinBtn.setBounds(302, 178, 97, 23);
		contentPane.add(joinBtn);
		
		setVisible(true);
		//로그인 액션
//		loginBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				MemberListFrame frame = new MemberListFrame(customer_id);
//			}
//			
//		});
		
		//회원가입액션
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame frame = new JoinFrame();
				
			}
		});
		
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String customer_id = tfCustomer_id.getText();
				String customer_pw = tfCustomer_pw.getText();
				MemberDAO dao = MemberDAO.getInstance();
				int result = dao.findByUserNameAndPassword(customer_id, customer_pw);
				System.out.println(result);
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
					//리스트화면으로 + 세션값
					
					MemberListFrame frame = new MemberListFrame(customer_id);
					
					dispose();
					System.out.println("로그인 세션 customer_id = " + customer_id);
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
				
			}
		});
	}
}
