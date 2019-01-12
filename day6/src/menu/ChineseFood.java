package menu;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
//Ctrl + Shift + O 하면 자동으로 불러줌


public class ChineseFood extends JFrame {
	private JTextField textField; // private은 상속을 받았을 때 이 클래스 밖에서 쓸 수 없는 거라는 뜻
	private JTextField textField_1;
	int count = 0; // class 바로 밑에 둬서 중괄호 안에서 자유롭게 쓰이도록
	final int price = 5000; // final 붙이면 변경 불가
	JLabel lblNewLabel_2 = new JLabel(""); // 중괄호 안에서 여러번 써야하므로 위로 올려줌
	public ChineseFood() {
		getContentPane().setBackground(new Color(255, 222, 173)); 
		// 똑같은 클래스 밑에서 복사해서 쓸거면 void나 int 같은 것 붙이지 않고 씀
		// static이 없어서 코딩하기 쉽고 메모리를 많이 안차지하는 장점
		setSize(700, 550);
		setTitle("주문하기");
		FlowLayout flow = new FlowLayout(); // 물 흐르듯 레이아웃 잡아주기
		getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("자장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //design에서 버튼 더블클릭하면 소스로 넘어옴
				count++;
				textField.setText(count + ""); // getText는 넣기, setText는 받아오기, + ""는 String으로 바꾸기 위해
				textField_1.setText(count*price + "");
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\jajang.JPG"));
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setToolTipText("자장 하나가 추가됨");
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price +"");
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\udong.JPG"));
			}
		});
		btnNewButton_1.setToolTipText("우동 하나가 추가됨");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짬뽕");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price +"");
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\jjambbong.JPG"));
			}
		});
		btnNewButton_2.setToolTipText("짬뽕 하나가 추가됨");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("개수");
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("가격");
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\중국집.png"));
		getContentPane().add(lblNewLabel_2);
		setVisible(true); // setVisible은 항상 맨 밑에
	}
	public static void main(String[] args) {
		ChineseFood cf = new ChineseFood();
	}

}
