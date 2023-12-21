package ch07_2;

class Shape2 {
	String name;
	double width;
	double height;
	
	void area() {
		System.out.println("Shape:area="+(width*height));
	}
}

class Triangle2 extends Shape2{
	Triangle2(String n, double w, double h){
		name=n; width=w; height=h;
	}	
}

class Rectangle2 extends Shape2{
	Rectangle2(String n, double w, double h){
		name=n; width=w; height=h;
	}
}

public class UpCastingTest2 {

	public static void main(String[] args) {
		Triangle2 to1=new Triangle2("정삼각형",10,20);
		System.out.println("to1="+to1);
		
		//Triangle to1=new Ractangle("직사각형",20,30); :에러
		
		Rectangle2 ro1=new Rectangle2("직사각형",20,30);
		//Rectangle ro2=new Triangle("정삼각형",20,10); 에러
		System.out.println("ro1="+ro1);
		
		Shape2 so1=new Triangle2("직삼각형",10,40);
		Shape2 so2=new Rectangle2("정사각형",30,30);
		System.out.println("so1="+so1);
		System.out.println("so2="+so2);
	}
}
