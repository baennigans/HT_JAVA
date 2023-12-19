package ch05;

public class Dog {

	String name;
	String breeds;
	int age;
	
	void wag() {
		System.out.printf("[%s] 살랑살랑~\n",name);
	}
	
	void bark() {
		System.out.printf("[%s] 멍멍!\n",name);
	}
	
	void bark(int times) {
		System.out.printf("[%s] 멍멍! (x%d)\n",name,times);
	}
}
