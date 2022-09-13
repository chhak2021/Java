package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/*
 * 이클립스 마켓플레이스 - WindowBuilder 설치
 * 
 */
public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Java Swing Components 실습");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 251, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(12, 39, 103, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("button1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button1 클릭!");
			}
		});
		
		btn1.setBounds(16, 64, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("button2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "button2 클릭!");
			}
		});
		
		btn2.setBounds(113, 64, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("button3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "button3 클릭!", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btn3.setBounds(210, 64, 97, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("button4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "button4 클릭!", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes 클릭!");
				}else {
					System.out.println("No 클릭!");
				}
			}
		});
		btn4.setBounds(307, 64, 97, 23);
		frame.getContentPane().add(btn4);
		
		JLabel lblNewLabel_1_1 = new JLabel("TextField 컴포넌트");
		lblNewLabel_1_1.setBounds(12, 111, 132, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 136, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(55, 133, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUid = new JButton("확인");
		btnUid.setBounds(172, 132, 57, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(234, 136, 110, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(234, 161, 110, 15);
		frame.getContentPane().add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.setBounds(172, 157, 57, 23);
		frame.getContentPane().add(btnName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(55, 158, 116, 21);
		frame.getContentPane().add(txtName);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 161, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(12, 186, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(55, 183, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.setBounds(172, 182, 57, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(234, 186, 110, 15);
		frame.getContentPane().add(lbResultHp);
		
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
			}
		});
	}
}
