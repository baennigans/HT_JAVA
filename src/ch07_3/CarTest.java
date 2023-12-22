package ch07_3;

public class CarTest {

	public static void main(String[] args) {
		Truck t1 = new Truck();
		Truck t2 = new Truck("봉고", 1.5);
		
		t1.carInfo();
		t2.carInfo();
	}
}

abstract class Car {
	String name;
	
	Car(String name) {
		this.name = name;
	}
}

class Truck extends Car {
	double payload;
	
	Truck(String name, double payload) {
		super(name);
		this.payload = payload;
	}
	
	Truck() {
		super("이름없음");
		payload = 0;
	}
	
	void carInfo(){
		System.out.println("차종 : "+name+", 적재량 : "+payload);
	}
}