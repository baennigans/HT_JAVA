package ch07_4;

public class MoreKeywords {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("장검", 1200, 10);
		Weapon w2 = new Weapon();
		
		w1.weaInfo();
		w2.weaInfo();
	}
}

abstract class Item {
	String name;
	int price;
	
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	Item(){
		this("이름없음", -1);
	}
}

class Weapon extends Item {
	int power;
	
	Weapon(){
		super();
		power = -1;
	}
	
	Weapon(String name, int price, int power){
		super(name, price);
		this.power = power;
	}
	
	void weaInfo() {
		System.out.printf("[%s] 골드 : %d / 공격력: %d \n", name, price, power);
		System.out.println(super.name+" / "+super.price+" / "+this.power);
	}
}