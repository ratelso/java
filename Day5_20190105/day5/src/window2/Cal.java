package window2;

public class Cal {
	public void add(int x, int y) {
		System.out.println("두 수의 합은 " + (x + y));
		// 괄호가 제 1 우선순위
	}
	public void minus(int x, int y) {
		System.out.println("두 수의 차는 " + (x - y));
	}
	public void mul(int x, int y) {
		System.out.println("두 수의 곱은 " + (x * y));
	}
	public void div(int x, int y) {
		System.out.println("두 수의 나눗셈은 " + (x / y));
	}
}
