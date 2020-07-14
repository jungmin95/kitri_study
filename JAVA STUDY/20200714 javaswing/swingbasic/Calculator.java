package swingbasic;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private int currValue;
	private JLabel answerLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 425, 96);
		contentPane.add(panel);
		panel.setLayout(null);

		answerLabel = new JLabel("0");
		answerLabel.setBounds(0, 5, 425, 81);
		answerLabel.setFont(new Font("±¼¸²", Font.BOLD, 30));
		answerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		answerLabel.setToolTipText("");
		panel.add(answerLabel);

		JButton Btn1 = new JButton("1");
		Btn1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn1.setBounds(12, 116, 97, 69);
		contentPane.add(Btn1);

		JButton Btn2 = new JButton("2");
		Btn2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn2.setBounds(121, 116, 97, 69);
		contentPane.add(Btn2);

		JButton Btn3 = new JButton("3");
		Btn3.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn3.setBounds(231, 116, 97, 69);
		contentPane.add(Btn3);

		JButton Btn4 = new JButton("4");
		Btn4.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn4.setBounds(12, 201, 97, 69);
		contentPane.add(Btn4);

		JButton Btn5 = new JButton("5");
		Btn5.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn5.setBounds(121, 201, 97, 69);
		contentPane.add(Btn5);

		JButton Btn6 = new JButton("6");
		Btn6.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn6.setBounds(231, 201, 97, 69);
		contentPane.add(Btn6);

		JButton Btn7 = new JButton("7");
		Btn7.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn7.setBounds(12, 280, 97, 69);
		contentPane.add(Btn7);

		JButton Btn8 = new JButton("8");
		Btn8.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn8.setBounds(121, 280, 97, 69);
		contentPane.add(Btn8);

		JButton Btn9 = new JButton("9");
		Btn9.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn9.setBounds(231, 280, 97, 69);
		contentPane.add(Btn9);

		JButton Btn0 = new JButton("0");
		Btn0.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btn0.setBounds(12, 359, 97, 69);
		contentPane.add(Btn0);

		JButton BtnPoint = new JButton(".");
		BtnPoint.setFont(new Font("±¼¸²", Font.BOLD, 20));
		BtnPoint.setBounds(121, 359, 97, 69);
		contentPane.add(BtnPoint);

		JButton Btnequal = new JButton("=");
		Btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int afterValue = Integer.parseInt(answerLabel.getText());
				answerLabel.setText(currValue + afterValue + "");
				
			}
			
		});
		Btnequal.setFont(new Font("±¼¸²", Font.BOLD, 20));
		Btnequal.setBounds(231, 359, 97, 69);
		contentPane.add(Btnequal);

		JButton BtnPlus = new JButton("+");
		BtnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answerLabel.getText();
				currValue = Integer.parseInt(curr);
				answerLabel.setText("0");
				
			}
			
		});
		BtnPlus.setFont(new Font("±¼¸²", Font.BOLD, 20));
		BtnPlus.setBounds(340, 116, 97, 69);
		contentPane.add(BtnPlus);

		JButton BtnMinus = new JButton("-");
		BtnMinus.setFont(new Font("±¼¸²", Font.BOLD, 20));
		BtnMinus.setBounds(340, 201, 97, 69);
		contentPane.add(BtnMinus);

		JButton btnNewButton_2_6 = new JButton("*");
		btnNewButton_2_6.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton_2_6.setBounds(340, 280, 97, 69);
		contentPane.add(btnNewButton_2_6);

		JButton btnNewButton_2_7 = new JButton("%");
		btnNewButton_2_7.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton_2_7.setBounds(340, 359, 97, 69);
		contentPane.add(btnNewButton_2_7);
		
		Btn1.addActionListener(new NumberPrint(answerLabel, "1"));
		Btn2.addActionListener(new NumberPrint(answerLabel, "2"));
		Btn3.addActionListener(new NumberPrint(answerLabel, "3"));
		Btn4.addActionListener(new NumberPrint(answerLabel, "4"));
		Btn5.addActionListener(new NumberPrint(answerLabel, "5"));
		Btn6.addActionListener(new NumberPrint(answerLabel, "6"));
		Btn7.addActionListener(new NumberPrint(answerLabel, "7"));
		Btn8.addActionListener(new NumberPrint(answerLabel, "8"));
		Btn9.addActionListener(new NumberPrint(answerLabel, "9"));
		Btn0.addActionListener(new NumberPrint(answerLabel, "0"));
		BtnPoint.addActionListener(new NumberPrint(answerLabel, "."));

	}
}
class NumberPrint implements ActionListener {

	private JLabel label;
	private String text;
	
	NumberPrint(JLabel l, String t) {
		label = l;
		text = t;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String curr = label.getText();
		if(curr.equals("0")) {
			label.setText(text);
		} else {
			
		label.setText(label.getText() + text);
		}
	}
	
	
	
}
