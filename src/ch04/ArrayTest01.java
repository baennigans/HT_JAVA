package ch04;

public class ArrayTest01 {
	public static void main(String[] args) {
		int[] scores = { 88,98,68,72,47 };
		
		for(int i=0; i<5; i++) {
			System.out.println("score["+i+"] = "+scores[i]);
		}
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += scores[i];
		}
		System.out.println("sum = "+sum);
		
	}
}
