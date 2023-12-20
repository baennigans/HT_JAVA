package ch06_4;

public class EncapsulationTest {

	public static void main(String[] args) {
		Account acc = new Account();
		System.out.println("잔액 : "+acc.getBalance()+"원");
		
		acc.setBalance(100000);
		System.out.println("잔액 : "+acc.getBalance()+"원");
	}
}

class Account {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int b) {
		balance = b;
	}
	
}