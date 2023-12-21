package ch07_2_2;

public class AreaCalculator {

	public static void main(String[] args) {
		Square s = new Square();
		s.name = "정사각형";
		s.length = 3;
		
		Triangle t = new Triangle();
		t.name = "삼각형";
		t.base = 4;
		t.height = 3;
		
		Circle c = new Circle();
		c.name = "원";
		c.radius = 4;
		
		Shape[] shapes =  { s, t, c };
		for(int i=0; i<shapes.length; i++) {
			
			if(shapes[i] instanceof Square) {
				System.out.println("정사각형의 한변의 길이 : "+((Square)shapes[i]).length);
			} else if(shapes[i] instanceof Triangle) {
				System.out.println("삼각형의 밑변의 길이 : "+((Triangle)shapes[i]).base);
				System.out.println("삼각형의 높이의 길이 : "+((Triangle)shapes[i]).height);
			} else {
				System.out.println("원의 반지름의 길이 : "+((Circle)shapes[i]).radius);
			}
			
			System.out.printf("%s의 넓이 : %.2f \n\n", shapes[i].name, shapes[i].area());
		}
	}
}

class Shape {
	String name;
	double area() {
		return 0;
	}
}

class Square extends Shape {
	int length;
	double area() {
		return length*length;
	}
}

class Triangle extends Shape {
	int base;
	int height;
	double area() {
		return base*height/2;
	}
}

class Circle extends Shape {
	int radius;
	double area() {
		return Math.PI*radius*radius;
	}
}


