package ch02;

public class MethodTest02 {
	
	//void 는 없다! 는 뜻
	public static void square(int length) {
		System.out.println("square 함수는 제곱을 계산 합니다.");
		System.out.println("length = "+length);
		System.out.println(length+"의 제곱="+(Math.pow(length, 2)));
	}
	
	public static void square() {
		System.out.println("default 매개변수는 100의제곱");
		System.out.println(Math.pow(100, 2));
	}
	
	
	public static void main(String[] args) {
		System.out.println("난 main 함수 !!!");
		
		System.out.println("===================================");
		//매서드 함수는 호출 해야 실행됨
		square(3); //square 함수 호출
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		square(4);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		square();
	}
}
