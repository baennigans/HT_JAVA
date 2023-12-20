package ch06_1;

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

class Hero {
	String name;
	int power;
	int speed;
	
	Hero(String n, int p, int s) {
		name = n;
		power = p;
		speed = s;
	}
	
	void toStr() {
		System.out.printf("이름 : %s , 파워 : %d , 스피드 : %d \n",name,power,speed);
	}
	
	String toStr2() {
		return String.format("Hero{name:%s, power:%d, speed:%d}", name, power, speed);
	}
}
