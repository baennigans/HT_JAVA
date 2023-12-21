package ch07_2_0;

public class UpCastingTest {

	public static void main(String[] args) {
		Square s = new Square();
		s.name = "정사각형";
		
		Triangle t = new Triangle();
		t.name = "삼각형";
		
		Circle c = new Circle();
		c.name = "원";
		
		Shape[] shapes = { s, t, c };
		for(int i=0; i<shapes.length; i++) {
			System.out.printf("%d번 인덱스의 도형 : %s \n", i, shapes[i].name);
		}
		
		Shape aa = new Square();
		aa.bb();
	}
}

class Shape {
	String name;
	void bb() {
		System.out.println("bb");
	}
}

class Square extends Shape {
	void bb() {
		System.out.println("BB");
	}
}
class Triangle extends Shape {}
class Circle extends Shape {}
