package ch06;

public class Hero {

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
