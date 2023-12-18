package ch03;

public class Square {

	public static void main(String[] args) {
		int n = 5;
		int s = square(n);
		System.out.println(n+"의 제곱은 "+s);
	}

	private static int square(int length) {
		return length*length;
	}
}
