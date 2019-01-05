package window2;

public class Dog {
//		정적특징(상태) --> 변수로 만들기
//		- 꼬리가 있음
//		- 다리갯수
		boolean tail;
		int leg;
//		동적특징(동작) --> 메소드로 만들기(함수 같은 것)
//		- 짖다
////	-꼬리를 흔들다
		public void bark() {
			//소괄호가 있어야 함수인 줄 앎
			System.out.println("멍");
		}
		public void shake() {
			System.out.println("꼬리흔들기");
		}
}
