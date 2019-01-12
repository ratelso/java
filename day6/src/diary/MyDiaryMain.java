package diary;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyDiaryMain extends JFrame {
	private final JButton button = new JButton("로그인");
	private JTextField textField;
	private JTextField textField_1;
	
	public MyDiaryMain() {
		getContentPane().setForeground(new Color(0, 128, 128));
		getContentPane().setBackground(new Color(255, 248, 220));
		getContentPane().setFont(new Font("Californian FB", Font.BOLD, 20));
		setSize(600, 600);
		setTitle("일기장");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("My Diary");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\mannheim.jpg"));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PW");
		getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sID = "so0982";
				String sPW = "so1221";
				if ((textField.getText().equals(sID)) && (textField_1.getText().equals(sPW))) { 
					JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
					textField.setText("");
					textField_1.setText("");
					MyDiarySub mds = new MyDiarySub();
				} else {
					JOptionPane.showMessageDialog(null, "다시 입력해주세요.");

				}
			}
		});
		getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton = new JButton("다시하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		getContentPane().add(btnNewButton);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		MyDiaryMain md = new MyDiaryMain();
	}

}
