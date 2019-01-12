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
import javax.swing.JTextArea;

public class MyDiarySub extends JFrame {
	private final JButton button = new JButton("로그인");
	private JTextField text;
	private JTextField text_1;
	
	public MyDiarySub() {
		getContentPane().setForeground(new Color(0, 128, 128));
		getContentPane().setBackground(new Color(255, 248, 220));
		getContentPane().setFont(new Font("Californian FB", Font.BOLD, 20));
		setSize(500, 1000);
		setTitle("일기장");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("하루하루 일기쓰기");
		lblNewLabel.setFont(new Font("HY엽서M", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\diary.jpg"));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("날짜");
		getContentPane().add(lblNewLabel_2);
		
		text = new JTextField();
		getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("제목");
		getContentPane().add(lblNewLabel_3);
		
		text_1 = new JTextField();
		getContentPane().add(text_1);
		text_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("저장");
		
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(20);
		textArea.setColumns(60);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("바탕체", Font.PLAIN, 13));
		getContentPane().add(textArea);
		getContentPane().add(btnNewButton_1);
		
		
		JButton btnNewButton = new JButton("다시하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				text_1.setText("");
				textArea.setText("");
			}
		});
		getContentPane().add(btnNewButton);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		MyDiarySub mds = new MyDiarySub();
	}

}
