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

import swingproject.dao.MemberDAO;
import swingproject.domain.Member;

public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfCustomer_id;
	private JTextField tfCustomer_pw;
	private JTextField tfCustomer_name;
	private JTextField tfCustomer_phone;
	private JTextField tfCustomer_birth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame frame = new JoinFrame();
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
	public JoinFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(146, 30, 159, 49);
		contentPane.add(lblNewLabel);

		tfCustomer_id = new JTextField();
		tfCustomer_id.setBounds(156, 100, 200, 21);
		contentPane.add(tfCustomer_id);
		tfCustomer_id.setColumns(10);

		tfCustomer_pw = new JTextField();
		tfCustomer_pw.setBounds(156, 140, 200, 21);
		contentPane.add(tfCustomer_pw);
		tfCustomer_pw.setColumns(10);

		tfCustomer_name = new JTextField();
		tfCustomer_name.setColumns(10);
		tfCustomer_name.setBounds(156, 180, 200, 21);
		contentPane.add(tfCustomer_name);

		tfCustomer_phone = new JTextField();
		tfCustomer_phone.setColumns(10);
		tfCustomer_phone.setBounds(156, 220, 200, 21);
		contentPane.add(tfCustomer_phone);

		tfCustomer_birth = new JTextField();
		tfCustomer_birth.setColumns(10);
		tfCustomer_birth.setBounds(156, 260, 200, 21);
		contentPane.add(tfCustomer_birth);

		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setBounds(60, 103, 57, 15);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(60, 143, 57, 15);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		lblNewLabel_3.setBounds(60, 183, 57, 15);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_4.setBounds(60, 223, 57, 15);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_5.setBounds(60, 263, 57, 15);
		contentPane.add(lblNewLabel_5);

		JTextArea taCustomer_address = new JTextArea();
		taCustomer_address.setBounds(156, 312, 200, 57);
		contentPane.add(taCustomer_address);

		JLabel lblNewLabel_6 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_6.setBounds(60, 317, 57, 15);
		contentPane.add(lblNewLabel_6);

		JButton joinCompleteBtn = new JButton("회원가입");
		joinCompleteBtn.setBounds(156, 396, 200, 55);
		contentPane.add(joinCompleteBtn);

		setVisible(true);

		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "확인");
//				dispose();
				Member member = new Member();
				member.setCustomer_id(tfCustomer_id.getText());
				member.setCustomer_pw(tfCustomer_pw.getText());
				member.setCustomer_name(tfCustomer_name.getText());
				member.setCustomer_phone(tfCustomer_phone.getText());
				member.setCustomer_birth(tfCustomer_birth.getText());
				member.setCustomer_address(taCustomer_address.getText());
				
				MemberDAO dao = MemberDAO.getInstance();
				int result = dao.save(member);
				
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "회원가입 완료");
					dispose();
					
				} else {
					JOptionPane.showMessageDialog(null, "회원가입 실패");
					dispose();
				}
			
			}

		});
	}
}
