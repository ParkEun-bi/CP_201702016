package 과제;

public class Shape {
		int width;
		int height;
		
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int area() {
		
		return area();
	}
}
class Triangle extends Shape {
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	public int area() { 
		System.out.print("삼각형의 넓이: ");
		return (width * height)/2;
	}
}
class Rectangle extends Shape{

	public Rectangle(int width, int height) {
		super(width, height);
	}
	public int area() {
		System.out.print("사각형의 넓이: ");
		return width * height;
	}
}
class Circle extends Shape{
	double radius =(double) width/2; //반지름

public Circle(int width, int height) {
	super(width, height);
}
public int area() {
	System.out.print("원의 넓이: ");
	return (int) ((double)3.14 * radius * radius);
}
}
