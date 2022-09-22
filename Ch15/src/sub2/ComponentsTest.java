package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
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
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 200, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 39, 127, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 64, 71, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(109, 64, 71, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "일반대화상자", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(183, 64, 71, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
				
				
			}
		});
		btn4.setBounds(257, 64, 71, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(22, 105, 127, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(33, 130, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(33, 157, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(33, 184, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과 :");
		lblTxtf1Result.setBounds(240, 133, 116, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 :");
		lblTxtf2Result.setBounds(240, 160, 116, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 :");
		lblTxtf3Result.setBounds(240, 187, 116, 15);
		contentPane.add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : "+txt);
			}
		});
		btnTxtf1.setBounds(157, 129, 71, 23);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Result.setText("결과 : "+txt);
			}
		});
		btnTxtf2.setBounds(157, 156, 71, 23);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Result.setText("결과 : "+txt);
			}
		});
		btnTxtf3.setBounds(157, 183, 71, 23);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(22, 222, 177, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(32, 247, 143, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(32, 268, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(93, 268, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(155, 268, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(216, 268, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(277, 268, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(32, 297, 212, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if(chk1.isSelected()) {
					list.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					list.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					list.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					list.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					list.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + list);				
			}
		});
		btnChk.setBounds(334, 268, 57, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(22, 322, 222, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(32, 343, 57, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(92, 343, 57, 23);
		contentPane.add(rbFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(32, 372, 167, 15);
		contentPane.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자");
				}else {
					lblGenderResult.setText("결과 : 여자");
				}				
			}
		});
		btnGender.setBounds(157, 343, 71, 23);
		contentPane.add(btnGender);
		
	}
}
