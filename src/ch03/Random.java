package ch03;

public class Random {

	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈 : "+n);
	}

	private static int rollDie() {
		double x = 6 * Math.random();
		int temp = (int)x;
		return temp+1;
	}
}
