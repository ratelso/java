package inherit; // 소속이 맨 윗줄

public class Person { // 클래스명 대문자
	//정적 특징 - 이름, 나이 
	String name;
	int age;
	//동적 특징 - 걷기, 웃기
	public void walk() {
		System.out.println("걷다");
	} // void: 이벤트에 대해 반응 없을 때, 
	   // 걷기에 대해 변수 없으므로 소괄호 안 비우기
	   // 걸었을 때 실행할 것 중괄호 안에 기재
	public void laugh() {
		System.out.println("웃다");
	}
}
