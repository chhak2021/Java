package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtfDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtfDisp = new JTextField();
		txtfDisp.setEditable(false);
		txtfDisp.setFont(new Font("굴림", Font.BOLD, 22));
		txtfDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtfDisp.setText("0");
		txtfDisp.setBounds(12, 10, 262, 43);
		contentPane.add(txtfDisp);
		txtfDisp.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 63, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(79, 63, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(147, 63, 60, 60);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(214, 63, 60, 60);
		contentPane.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 133, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(79, 133, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(147, 133, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setBounds(214, 133, 60, 60);
		contentPane.add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 203, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(79, 203, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(147, 203, 60, 60);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(214, 203, 60, 60);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 275, 60, 60);
		contentPane.add(btn0);
		
		JButton btnCancel = new JButton("C");
		btnCancel.setBounds(79, 275, 60, 60);
		contentPane.add(btnCancel);
		
		JButton btnEq = new JButton("=");
		btnEq.setBounds(147, 275, 60, 60);
		contentPane.add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(214, 275, 60, 60);
		contentPane.add(btnPlus);
	}

}
