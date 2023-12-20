package ch06_4;

class Account2{
	//속성은 private : 다른 클래스에서 속성 수정, 조회 불가
	private long balance; //잔액
	private String pw; //비번
	private String ssn; //주인 주민번호
	
	//계좌 만들때 초기값 설정
	public Account2(long b, String p, String s) {
		balance=b;
		pw=p;
		ssn=s;
	}
	
	//getPw() : 비밀번호 조회 없음
	//setPw() : 비밀번호 수정
	//clerkCheckSsn : 직원 확인한 주민번호 , newPw : 새비번
	public void setPw(String clerkCheckSsn, String newPw) {
		if(clerkCheckSsn.equals(ssn)) {
			pw=newPw;
			System.out.println("비밀번호 변경완료!!");
		}
	}
	
	//setSsn() : 주민번호 수정 없음
	//getSsn() : 주민번호 조회
	public String getSsn() {
		return ssn;
	}
	
	//잔액 조회
	public long getBalance() {
		return balance;
	}
	
	//잔액 수정(입금)
	public long deposit(int inputMoney) {
		balance += inputMoney;
		System.out.println("입금 성공!!");
		return inputMoney;
	}
	
	//잔액 수정(출금)
	//outMoney : 출금액  inputPw: 입력비번
	public long withdraw(long outMoney, String inputPw) {
		if(outMoney<=balance) {
			if(pw.equals(inputPw)) {
				balance-=outMoney;
				System.out.println("출금 성공!!");
				return outMoney;
			}
		}
		System.out.println("출금 오류!!");
		return 0;
	}
}

public class EncapsulationTest2 {

	public static void main(String[] args) {
		
		Account2 a1 = new Account2(5000000000L, "0070", "011234789");
		//속성이 private 이므로 직접 수정 조회 안됨 - a1.pw / a1.balance=10000000000L (X)
		
		//비밀번호 조회 불가 - a1.getPw() (X)
		//비밀번호 수정 가능
		System.out.println("==== 비밀번호변경 ====");
		a1.setPw("011234789", "9128");

		//주민번호 수정 불가 - a1.setSsn() (X)
		//주민번호 조회 가능
		System.out.println("==== 주민번호조회 ====");
		System.out.println("주민번호 : "+a1.getSsn());
		
		//잔액조회
		System.out.println("===== 잔액조회 =====");
		System.out.println("잔액 = "+a1.getBalance());
		
		//30억 출금
		System.out.println("======= 출금 =======");
		long out = a1.withdraw(3000000000L, "9128");
		System.out.println("출금액 = "+out);
		System.out.println("잔액 = "+a1.getBalance());
		
		//비밀번호 오류
		System.out.println("======= 출금 =======");
		out = a1.withdraw(3000000000L, "1234");
		System.out.println("출금액 = "+out);
		System.out.println("잔액 = "+a1.getBalance());
		
		//2천원 입금
		System.out.println("======= 입금 =======");
		long in = a1.deposit(2000);
		System.out.println("입금액 = "+in);
		System.out.println("잔액 = "+a1.getBalance());
	}
}