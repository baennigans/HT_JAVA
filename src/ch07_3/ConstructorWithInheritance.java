package ch07_3;

public class ConstructorWithInheritance {

	public static void main(String[] args) {
		new BBB();
	}
}

class AAA {
	AAA() {
		System.out.println("AAA() 생성자 호출 완료 !!");
	}
}

class BBB extends AAA {
	BBB() {
	  //super() 이 자동 생략 -> 부모의 생성자 먼저 호출 후 자식의 생성자 호출
		System.out.println("BBB() 생성자 호출 완료 !!");
	}
}