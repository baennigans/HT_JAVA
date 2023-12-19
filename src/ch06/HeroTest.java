package ch06;

public class HeroTest {

	public static void main(String[] args) {
		
		Hero ironMan = new Hero("아이언맨", 100, 120);
		Hero hulk = new Hero("헐크", 200, 80);
		
		ironMan.toStr();
		hulk.toStr();
		
		System.out.println(ironMan.toStr2());
		System.out.println(hulk.toStr2());
	}
}
