package ch05;

public class ObjectTest02 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.breeds = "골든리트리버";
		d1.name = "망고";
		d1.age = 2;
		
		d2.breeds = "믹스";
		d2.name = "까미";
		d2.age = 3;		
		
		System.out.printf("d1 => { %s, %s, %d세 }\n", d1.breeds, d1.name, d1.age);
		System.out.printf("d2 => { %s, %s, %d세 }\n", d2.breeds, d2.name, d2.age);
		
		d1.wag();
		d1.bark();
		d1.bark(5);
		
		d2.wag();
		d2.bark();
		d2.bark(4);
	}
}
