package ch07_2_1;

class Shape{
	String name;
	double width;
	double height;
	
	void area() {
		System.out.println("Shape:area="+(width*height));
	}
}
class Triangle extends Shape{
	double base;
	
	Triangle(String n, double w, double h){
		name=n; width=w; height=h;
	}
	void area() {
		System.out.println("Triangle:Area="+(height*width*0.5));
	}
	void equalTriangle() {
		if(base==height) {
			System.out.println("정삼각형");
		}else {
			System.out.println("직삼각형");
		}
	}
	
}
class Rectangle extends Shape{
	double length;
	Rectangle(String n, double w, double h){
		name=n; width=w; height=h;
	}
	void volume() {
		System.out.println("Rectangle:volume="+(length*height*width));
	}
}

public class UpCastingTest2 {

	public static void main(String[] args) {
		Triangle t=new Triangle("정삼각형", 10,10);
		System.out.println("t="+t);
		Rectangle r = new Rectangle("직사각형",30,5);
		System.out.println("r="+r);
		
		Shape [] shapes = {t,r};
		
		for(int i=0;i<2;i++) {
			System.out.println("shapes["+i+"]="+shapes[i]);
			
			System.out.println("shapes["+i+"] instanceof Triange="
			                   +(shapes[i] instanceof Triangle ) );
			
			System.out.println("shapes["+i+"] instanceof Rectagle="
	                   +(shapes[i] instanceof Rectangle ) );
			
			if(shapes[i] instanceof Triangle) {
				System.out.println("찐은 Triangle!!!");
				
				((Triangle)shapes[i]).base = 100;
				((Triangle)shapes[i]).equalTriangle();
				System.out.println("Triangle.base="+ ((Triangle)shapes[i]) .base);
			}
			if(shapes[i] instanceof Rectangle) {
				System.out.println("찐은 Rectangle");
				((Rectangle)shapes[i]).length=3;
				((Rectangle)shapes[i]).volume();
			}
			
			System.out.println("==================================================");
		}
		
	}//end main
}//end class
