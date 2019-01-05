package window2;

public class TV {
	//정적특징(상태) --> 변수
	//- 모양, 받침대
	String shape;
	boolean stand;
	//동적특징(동작) --> 메소드
	//- 채널 변경하다. TV 켜다.
	public void change(int ch) {
		System.out.println(ch + "로 채널 변경");
	}
	public void turnOn() {
		System.out.println("TV켜기");
	}
}
