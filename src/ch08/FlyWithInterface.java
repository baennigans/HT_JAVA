package ch08;

public class FlyWithInterface {
	public static void main(String[] args) {
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();
		
		Flyable[] arr = { bird, copter, rocket };
		System.out.println("=================");
		for(int i=0; i<arr.length; i++) {
			arr[i].fly();
			System.out.println("=================");
		}
	}
}

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("새가 날아갑니다.");
	}
}

class Helicopter implements Flyable {
	public void fly() {
		System.out.println("헬리콥터가 날아갑니다.");
	}
}

class Rocket implements Flyable {
	public void fly() {
		System.out.println("로켓이 날아갑니다.");
	}
}

