package ch07_4;

public class AnimalTest {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.name = "호랑이이";
		Lion l = new Lion();
		l.name = "사자자";
		Dog d = new Dog();
		d.name = "개개";
		Cat c = new Cat();
		c.name = "고양이이";
		
		Animal[] animals = { t, l, d, c };
		for(int i=0; i<animals.length; i++) {
			System.out.println("저의 이름은 "+animals[i].name+" 입니다.");
			animals[i].cry();
		}
	}
}

abstract class Animal {
	String name;
	abstract void cry();
}

class Tiger extends Animal {
	void cry() {
		System.out.println("어흥!!");
	}
}

class Lion extends Animal {
	void cry() {
		System.out.println("크아앙!!");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍!!");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야용~~");
	}
}