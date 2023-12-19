package ch04;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		int[] run = { 42, 66, 57, 54, 88, 64, 71 };
		int sum = 0;
		
		for(int i=0; i<run.length; i++) {
			sum += run[i];
		}
		
		double avg = (double)sum/run.length;
		
		System.out.println("달리기 시간의 총합 : "+sum);
		System.out.printf("달리기 시간의 평균 : %d분 %.0f초", (int)avg, (avg%1)*60);	
	}
}
