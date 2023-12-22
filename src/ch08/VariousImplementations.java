package ch08;

public class VariousImplementations {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.playMusic("상어송");
		sp.beep();
		
		sp.call("1234-5678");
		sp.recieve();
		
		sp.sendMsg("0000-0000", "안녕하세요");
		sp.receiveMsg();
	}
}

interface Alarm {
	void playMusic(String title);
	void beep();
}

interface Phone {
	void call(String phoneNum);
	void recieve();
}

interface Messenger {
	void sendMsg(String phoneNum, String msg);
	void receiveMsg();
}

class SmartPhone implements Alarm, Phone, Messenger {
	private String myPhoneNum = "9999-9999";
	
	public void playMusic(String title) {
		System.out.println("["+title+"]이 재생됩니다.");
	}

	public void beep() {
		System.out.println("[비프음]이 재생됩니다. 삐빕~ 삐비비비빕!");
	}
	
	public void call(String phoneNum) {
		System.out.println("["+phoneNum+"]로 전화를 겁니다..rrr");
	}
	
	public void recieve() {
		System.out.println("["+myPhoneNum+"]님 전화가 왔습니다.");
	}
	
	public void sendMsg(String phoneNum, String msg) {
		System.out.println("["+phoneNum+"]로 메세지 전송 : "+msg);
	}
	
	public void receiveMsg() {
		System.out.println("["+myPhoneNum+"]님 메세지가 왔습니다.");
	}
}