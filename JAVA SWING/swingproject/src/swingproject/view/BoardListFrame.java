package swingproject.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
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

import swingproject.dao.BoardDao;
import swingproject.domain.Board;
import swingproject.domain.Sample;

public class BoardListFrame extends JFrame {

	private String customer_id; // 세션
	private JPanel contentPane;
	private JTable table;
	private JLabel lbTitle;
	private JButton logoutBtn;
	private DefaultTableModel tableModel;
	private int board_no;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Member member = new Member();
					BoardListFrame frame = new BoardListFrame();

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
	public BoardListFrame() {
		this(null);
	}

	public BoardListFrame(String customer_id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1032, 584);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 104, 1006, 408);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		System.out.println("BoardListFrame 세션 id: " + customer_id);
		contentPane.setLayout(null);
		JLabel lbTitle = new JLabel("Board List");
		lbTitle.setBounds(5, 44, 1006, 50);
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lbTitle.setPreferredSize(new Dimension(738, 50));
		contentPane.add(lbTitle);
		// db데이터 가져오기
		Vector<String> boardName = Sample.getBoardName();
		BoardDao dao = BoardDao.getInstance();
		List<Board> list = dao.readAll();

		// tableModel에 열 이름과 행 개수 설정
//		tableModel = new DefaultTableModel(boardName,0);
		String[] colNames = new String[] { "board_no", "board_name", "board_content", "board_date", "board_count" };
		Object[][] rowDatas = new Object[list.size()][colNames.length];
		// tableModel에 전체 행 넣기

		for (int i = 0; i < list.size(); i++) {

			rowDatas[i] = new Object[] { 
					list.get(i).getBoard_no(),
					list.get(i).getBoard_name(),
					list.get(i).getBoard_content(),
					list.get(i).getBoard_date(),
					list.get(i).getBoard_count()

			};
		}

		// tableModel을 JTable에 넣기
		JTable table = new JTable(tableModel);

		table.setModel(new DefaultTableModel(rowDatas, colNames) {
			boolean[] columnEditables = new boolean[] {false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}

		});
		table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(45);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(164);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(164);
        table.getColumnModel().getColumn(4).setResizable(false);
        table.getColumnModel().getColumn(4).setPreferredWidth(140);
        
        
        table.addMouseListener(new MouseAdapter() {
        	Board board = new Board();
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int board_no = board.getBoard_no();
        		System.out.println("==========================");
        		System.out.println("클릭된 번호 rownum : " + board_no);
        		System.out.println("==========================");
        		board = list.get(board_no);
        		
        		new BoardDetailFrame(board);
        	}
        });
        
		JButton boardDeleteBtn = new JButton("\uAE00 \uC0AD\uC81C");
		boardDeleteBtn.setBounds(245, 522, 97, 23);
		contentPane.add(boardDeleteBtn);
		
//        table.addMouseListener(new MouseAdapter() {
//        	@Override
//        	public void mouseClicked(MouseEvent e) {
//        		int board_no = table.getSelectedRow();
//        		Board board = new Board();
//        		board = list.get(board_no);
//        		
//        		System.out.println("눌린 번호 : " + board_no);
//        		
//        		boardDeleteBtn.addActionListener(new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						 BoardDao dao = new BoardDao();
//						 Board board = new Board();
//						 
//						 
//						 
//						 board.setBoard_no(board.getBoard_no());
//						 System.out.println("선택된 번호" + board_no);
//						 
//						 dao.deleteBoard(board.getBoard_no());
//						 System.out.println("지워볼까 : " + board_no);
//						
//					}
//				});
//        	}
//        
//		});
        
//        table.addMouseListener(new MouseAdapter() {
//        	@Override
//        	public void mouseClicked(MouseEvent e) {
//        		int rowNum = table.getSelectedRow();
//        		Board board = new Board();
//        		board = list.get(rowNum);
//        		
//        		new BoardUpdate(board);
//        	}
//        });
        scrollPane.setViewportView(table);

		
		table.setFont(new Font("돋움", Font.PLAIN, 20));
		table.setRowHeight(25);

		// JTable에 scroll달아서 add하기
//		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane);

		JButton logoutBtn = new JButton("로그아웃");
		logoutBtn.setBounds(5, 522, 108, 23);
		contentPane.add(logoutBtn);
		
		JButton boardCreateBtn = new JButton("\uAE00 \uC791\uC131");
		boardCreateBtn.setBounds(125, 522, 108, 23);
		contentPane.add(boardCreateBtn);
		
		JButton btnNewButton = new JButton("\uACF5\uC9C0\uC0AC\uD56D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(5, 10, 254, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uACE0\uAC1D\uAD00\uB9AC");
		btnNewButton_1.setBounds(252, 10, 254, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\uC608\uC57D\uAD00\uB9AC");
		btnNewButton_1_1.setBounds(498, 10, 254, 37);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\uC7AC\uACE0\uAD00\uB9AC");
		btnNewButton_1_2.setBounds(750, 10, 254, 37);
		contentPane.add(btnNewButton_1_2);
		

		
		setVisible(true);
		
		
		
		logoutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "로그아웃");
				dispose();
				new LoginFrame();

			}
		});
		boardCreateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				BoardCreateFrame bcfame = new BoardCreateFrame(customer_id);
				dispose();
//				new BoardCreateFrame();
				
			}
			
		});

		
		if (customer_id == null) {
			System.out.println("if문    " + customer_id);
			JOptionPane.showMessageDialog(null, "인증되지 않은 사용자");
			dispose();

		} else {
			setVisible(true);
		}
	}
}
