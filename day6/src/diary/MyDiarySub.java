package diary;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MyDiarySub extends JFrame {
	private final JButton button = new JButton("로그인");
	private JTextField titleText;
	private JTextField noText;
	JTextArea contentText = new JTextArea();
	
	public MyDiarySub() {
		getContentPane().setForeground(new Color(0, 128, 128));
		getContentPane().setBackground(new Color(255, 248, 220));
		getContentPane().setFont(new Font("Californian FB", Font.BOLD, 20));
		setSize(470, 800);
		setTitle("일기장");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("하루하루 일기쓰기");
		lblNewLabel.setFont(new Font("HY엽서M", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pc\\Desktop\\shj\\day6\\deardiary.jpg"));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("번호");
		lblNewLabel_4.setFont(new Font("나눔스퀘어라운드 Light", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblNewLabel_4);
		
		noText = new JTextField();
		getContentPane().add(noText);
		noText.setColumns(12);
		
		JLabel lblNewLabel_3 = new JLabel("제목");
		lblNewLabel_3.setFont(new Font("나눔스퀘어라운드 Light", Font.PLAIN, 12));
		getContentPane().add(lblNewLabel_3);
		
		titleText = new JTextField();
		getContentPane().add(titleText);
		titleText.setColumns(16);
		
		JButton saveButton = new JButton("일기저장");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();
				try { // 에러 잡을 때
				FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
				f.write(noT + "\n"); //쓰기
				f.write(titleT + "\n");  
				f.write(contentT);  
				f.flush(); // 밀어넣기
				f.close(); // 닫기
				noText.setText("");
				titleText.setText("");
				contentText.setText("");
				JOptionPane.showMessageDialog(null, "저장됨");
				}catch (Exception er) { //에러 잡을 때
					JOptionPane.showMessageDialog(null, "저장 중 에러 발생");
					//에러 잡아서 어떻게 처리할 지
				}
			}
		});
		saveButton.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 12));
		
		
		contentText.setRows(10);
		contentText.setColumns(35);
		contentText.setLineWrap(true);
		contentText.setFont(new Font("나눔스퀘어라운드 Light", Font.PLAIN, 13));
		getContentPane().add(contentText);
		getContentPane().add(saveButton);
		
		
		JButton readButton = new JButton("일기읽기");
		readButton.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 12));
		readButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				try{
				FileReader f2 = new FileReader("c:/diary/" + noT + ".txt");
				BufferedReader bfr = new BufferedReader(f2); // 통째로 읽어오기
				String noR = bfr.readLine(); //읽어와서 한 줄 씩 
				String titleR = bfr.readLine(); //변수명 첫글자는 소문자
				String contentR = bfr.readLine();
				noText.setText(noR);
				titleText.setText(titleR);
				contentText.setText(contentR);
				noText.setForeground(Color.RED);
				JOptionPane.showMessageDialog(null, "읽음");
				}catch (Exception er2) {
					JOptionPane.showMessageDialog(null, "읽기에러발생");
				}
			}
		});
		getContentPane().add(readButton);
		
		JButton resetButton = new JButton("다시하기");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noText.setText("");
				titleText.setText("");
				contentText.setText("");
			}
		});
		resetButton.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 12));
		getContentPane().add(resetButton);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		MyDiarySub mds = new MyDiarySub();
	}

}
