package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요: ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		MyCal mycal = new MyCal();
		int total = mycal.calculate(input1, input2)*100;
		System.out.println("계산된 결과는 "+total);
	}

}
