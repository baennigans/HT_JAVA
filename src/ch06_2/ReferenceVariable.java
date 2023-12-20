package ch06_2;

public class ReferenceVariable {

	public static void main(String[] args) {
		Dog kkami = new Dog("까미",3);
		int age = 22;
		
		System.out.println(kkami.age+" "+kkami.name);
		System.out.println(kkami.getInfo());
		System.out.println(age);
	}
}

class Dog {
	String name;
	int age;
	
	Dog(String n, int a){
		name = n;
		age = a;
	}
	
	String getInfo() {
		return String.format("%s , %d",name ,age);
	}
}
