package inherit;

public class MyHome {

	public static void main(String[] args) {
		Superman sm = new Superman();
		sm.name = "클라크";
		sm.age = 100;
		sm.speed = 100;
		sm.height = 1000;
		sm.laugh();
		sm.run();
		sm.fly();
	}

}
