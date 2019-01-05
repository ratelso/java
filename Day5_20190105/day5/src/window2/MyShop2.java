package window2;

import java.util.Scanner;

public class MyShop2 {

	public static void main(String[] args) {
		int price = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 인원을 입력해주세요.");
		System.out.print("주문인원: ");
		int input = sc.nextInt();
		Cal2 cal2 = new Cal2();
		int sum = cal2.mul(input, price);
		if (sum>=20000) {
			System.out.println("내실 금액은 " + (sum-3000));
		} else {
			System.out.println("내실 금액은 " + sum);
		}
	
	}

}
