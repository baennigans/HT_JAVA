package ch06_3;

public class StaticTest {
	
	public static void main(String[] args) {
		Student park = new Student(2019122104, "Park");
		Student kim = new Student(2019206028, "Kim");
		Student lee = new Student(2019153237, "Lee");
		
		System.out.println("총 학생 수 : "+Student.count);
		park.stuInfo();
		kim.stuInfo();
		lee.stuInfo();
	}
}

class Student {
	static int count = 0;
	int id;
	String name;
	
	Student(int i, String n){
		count += 1;
		id = i;
		name = n;
	}
	
	void stuInfo() {
		System.out.printf("학번 : %d , 이름 : %s \n", id, name);
	}
}
