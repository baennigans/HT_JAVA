package ch06;

public class DrinkTest {

	public static void main(String[] args) {
		Drink d1 = new Drink();
		Drink d2 = new Drink("박카스", 800);
		Drink d3 = new Drink("콜라", 1200);
		
		System.out.println(d1.name+", "+d1.price+"원");
		System.out.println(d2.name+", "+d2.price+"원");
		System.out.println(d3.name+", "+d3.price+"원");
	}
}
