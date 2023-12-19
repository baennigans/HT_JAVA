package ch04;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[] sales = new int[5];
		
		sales[0] = 52;
		sales[1] = 50;
		sales[2] = 55;
		sales[3] = 42;
		sales[4] = 38;
		
		int sum = sales[0]+sales[1]+sales[2]+sales[3]+sales[4];
		System.out.printf("총 판매량: %d잔", sum);
	}
}
