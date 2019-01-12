package inherit;

public class Man extends Person { // Person 부품을 확장해서 쓰기
	//정적 특징 - 스피드
	int speed;
	//동적 특징 - 달리기
	public void run() {
		System.out.println("달리다");
	}
}
