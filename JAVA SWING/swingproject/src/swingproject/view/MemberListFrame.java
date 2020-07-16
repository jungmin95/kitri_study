package swingproject.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import swingproject.dao.MemberDAO;
import swingproject.domain.Member;
import swingproject.domain.Sample;

public class MemberListFrame extends JFrame {

	private String customer_id; //세션
	private JPanel contentPane;
	private JTable table;
	private JLabel lbTitle;
	private JButton logoutBtn;
	private DefaultTableModel tableModel;

	


	
	
	
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Member member = new Member();
					MemberListFrame frame = new MemberListFrame();
					
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberListFrame() {
		this(null);
	}
	
	public MemberListFrame(String customer_id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1032, 584);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		System.out.println("memberlistframe : " +customer_id);
		JLabel lbTitle = new JLabel("회원정보");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lbTitle.setPreferredSize(new Dimension( 738, 50 ));
		contentPane.add(lbTitle, BorderLayout.NORTH);
		//db데이터 가져오기
		Vector<String> memberName = Sample.getMemberName();
		MemberDAO dao = MemberDAO.getInstance();
		Vector<Member> members = dao.findByAll();
		
		
		//tableModel에 열 이름과 행 개수 설정
		tableModel = new DefaultTableModel(memberName,0);
		
		//tableModel에 전체 행 넣기
		for (int i = 0; i < members.size(); i++) {
			Vector<Object> row = new Vector<>();
			row.addElement(members.get(i).getCustomer_id());
			row.addElement(members.get(i).getCustomer_pw());
			row.addElement(members.get(i).getCustomer_name());
			row.addElement(members.get(i).getCustomer_phone());
			row.addElement(members.get(i).getCustomer_birth());
			row.addElement(members.get(i).getCustomer_address());	
			tableModel.addRow(row);
		}
		
		//tableModel을 JTable에 넣기
		JTable table = new JTable(tableModel);
		
		table.setFont(new Font("돋움", Font.PLAIN, 20));
		table.setRowHeight(25);
		
		//JTable에 scroll달아서 add하기
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JButton logoutBtn = new JButton("로그아웃");
		contentPane.add(logoutBtn, BorderLayout.SOUTH);
		
		logoutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "로그아웃");
				dispose();
				new LoginFrame();
				
			}
		});
		
		
		if(customer_id == null) {
			System.out.println("if문    " + customer_id);
			JOptionPane.showMessageDialog(null, "인증되지 않은 사용자");
			dispose();
			
		} else {
			setVisible(true);
		}
	}

}



