package window2;

public class MyRoom {

	public static void main(String[] args) {
		Dog dog = new Dog();
		// new: 복사, Dog()는 복사할 객체, 맨 앞 Dog는 지금 만든 dog 변수의 원래 형태
		dog.leg = 4;
		dog.tail = true;
		// .은 접근 연산자
		dog.bark();
		dog.shake();
		
		System.out.println(dog.leg);
		System.out.println(dog.tail);
		
		System.out.println("--------------");
		TV tv1 = new TV();
		tv1.shape = "네모";
		tv1.stand = true;
		tv1.turnOn();
		tv1.change(5);
		
		TV tv2 = new TV();
		tv2.shape = "다이아";
		tv2.stand = false;
		tv2.turnOn();
		tv2.change(7);
		System.out.println(tv1); //주소값 보기
		System.out.println(tv2);
	}

}
