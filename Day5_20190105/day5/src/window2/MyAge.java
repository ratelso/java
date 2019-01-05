package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAge {
	//변수선언은 밖에서: 
	JFrame f; //선언(사용할 수 있는 범위: 이걸 포함하고 있는 중괄호 안에서 모두 쓸 수 있음)
	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n, y ,a;
	//이것들을 static에 붙이면 메모리 많이 차지해서 밖으로 빼는 것
	public MyAge() {
		f = new JFrame();
		f.setSize(270, 300);
		top = new JLabel("<<<<<성인인증 프로그램입니다.>>>>>");
		name = new JLabel("이름");
		year = new JLabel("생년월일");
		age = new JLabel("나이");
		result = new JLabel();
		confirm = new JButton("인증");
		n = new JTextField(20); // 소괄호 안 사이즈 지정
		y = new JTextField(20); 
		a = new JTextField(20); 
		
		FlowLayout flow = new FlowLayout(); // 창 안에 순서대로 세팅해주는 옵젝
		f.setLayout(flow); // 세팅해주는 메소드
		f.add(top);
		f.add(name);
		f.add(n);
		f.add(year);
		f.add(y);
		f.add(age);
		f.add(a);
		f.add(confirm);
		f.add(result);
		
		result.setForeground(Color.BLUE);
		top.setForeground(Color.BLACK);
		confirm.setForeground(Color.GREEN);
		confirm.setBackground(Color.LIGHT_GRAY);
		
		confirm.addActionListener(new ActionListener() {
			//액션 넣을 때 addAction 후 ActionListener 바로 복사
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();
				String year = y.getText();
				
				int yearInt = Integer.parseInt(year);
				int ageResult = 2019 -yearInt +1;
				a.setText(ageResult+"");;
				
				if (ageResult >= 19) {
					result.setText(name + "는 성인입니다.");
				} else {
					result.setText(name + "는 미성인입니다.");					
				}
			}
		});
		f.setVisible(true);  //값 보이기
	}
	
	public static void main(String[] args) {
		MyAge age = new MyAge();
		
	}
	//

}
