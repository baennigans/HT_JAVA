package ch07_1;

public class RPGTest {
	public static void main(String[] args) {
		Novice novice = new Novice();
		Wizard wizard = new Wizard();
		Knight knight = new Knight();
		
		novice.name = "초보자";
		novice.hp = 100;
		novice.speed = 2;
		
		wizard.name = "간달프";
		wizard.hp = 120;
		wizard.mp = 100;
		wizard.speed = 3;
		
		knight.name = "킹아서";
		knight.hp = 150;
		knight.stamina = 70;
		knight.speed = 4;
		
		novice.punch();
		novice.move();
		
		wizard.punch();
		wizard.fireball();
		wizard.move();
		
		knight.punch();
		knight.slash();
		knight.move();
	}
}

class Novice {
	String name;
	int hp;
	int speed;
	
	void punch() {
		System.out.printf("%s의 펀치!! (HP:%d)\n", name, hp);
	}
	
	void move() {
		System.out.printf("%s의 %d만큼 이동~~\n", name, speed);
	}
}

class Wizard extends Novice {
	int mp;
	
	void fireball() {
		System.out.printf("%s의 파이어볼!! (HP:%d/MP:%d)\n", name, hp, mp);
	}
}

class Knight extends Novice {
	int stamina;
	
	void slash() {
		System.out.printf("%s의 슬래쉬!! (HP:%d/ST:%d)\n", name, hp, stamina);
	}
}