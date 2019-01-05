package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizzashop {
	//변수선언은 밖에서: 
	JFrame f; //선언(사용할 수 있는 범위: 이걸 포함하고 있는 중괄호 안에서 모두 쓸 수 있음)
	JLabel top, result;
	JButton combo, potato, bulgogi;
	JTextField n;
	int sum = 0;
	int combo_n = 0;
	int potato_n = 0;
	int bulgogi_n = 0;
	JTextArea list;
	private JLabel label;
	private JButton btnNewButton;
	//이것들을 static에 붙이면 메모리 많이 차지해서 밖으로 빼는 것
	public Pizzashop() {
		f = new JFrame();
		f.setSize(350, 300);
		top = new JLabel("<<<<<안녕하세요. 피자가게입니다. 골라주세요>>>>>");
		combo = new JButton("콤보피자");
		potato = new JButton("포테이토피자");
		bulgogi = new JButton("불고기피자");
		result = new JLabel("개수");
		n = new JTextField(20);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow); // 세팅해주는 메소드
		list = new JTextArea(3, 30);
		f.getContentPane().add(top);
		f.getContentPane().add(combo);
		f.getContentPane().add(potato);
		f.getContentPane().add(bulgogi);
		f.getContentPane().add(result);
		f.getContentPane().add(n);
		f.getContentPane().add(list);
		result.setForeground(Color.RED);
		
		label = new JLabel("총계");
		f.getContentPane().add(label);
		
		btnNewButton = new JButton("PUSH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "헤에...");
			}
		});
		f.getContentPane().add(btnNewButton);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				n.setText(sum+"");
				combo_n++;
				list.setText("콤보: " + combo_n + "개\n"
						+ "포테이코: " + potato_n + "개\n"
						+ "불고기: " + bulgogi_n + "개\n"); // \n == 엔터
						
			}
		});
		potato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				n.setText(sum+"");		
				potato_n++;
				list.setText("콤보: " + combo_n + "개\n"
						+ "포테이코: " + potato_n + "개\n"
						+ "불고기: " + bulgogi_n + "개\n"); // \n == 엔터
				
			}
		});
		bulgogi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				n.setText(sum+"");	
				bulgogi_n++;
				list.setText("콤보: " + combo_n + "개\n"
						+ "포테이코: " + potato_n + "개\n"
						+ "불고기: " + bulgogi_n + "개\n"); // \n == 엔터
				
			}
		});
		f.setVisible(true);  //값 보이기
	}
	
	public static void main(String[] args) {
		Pizzashop mypizza = new Pizzashop();
		
	}
	//

}
