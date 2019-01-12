package inherit;

public class Superman extends Man {
	//정적 특징
		int height;
	//동적 특징
		public void fly() {
			run(); // 메소드 불러와서 바로 쓰기
			System.out.println("날다");
		}
}
