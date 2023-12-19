package ch05;

public class ObjectTest01 {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		System.out.println("품종 : "+c.breeds);
		System.out.println("이름 : "+c.name);
		System.out.println("무게 : "+c.weight);

		c.breeds = "페르시안";
		c.name = "네로";
		c.weight = 4.37;
		
		System.out.println("품종 : "+c.breeds);
		System.out.println("이름 : "+c.name);
		System.out.println("무게 : "+c.weight+"kg");
		
		c.meow();
		c.claw();
	}
}
