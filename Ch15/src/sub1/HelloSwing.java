package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2022/09/22
 * 이름 : 김철학
 * 내용 : 자바 Swing 실습하기
 */
public class HelloSwing {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello Swing");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		Container pane = frame.getContentPane();
		
		JLabel label = new JLabel("Hello Java Swing!");
		pane.add(label);
		
		JButton button = new JButton("확인");
		button.setPreferredSize(new Dimension(60, 20));
		pane.add(button);
	}
}
