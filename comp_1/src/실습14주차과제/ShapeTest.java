package 과제;
import java.util.Scanner;
public class ShapeTest {
	private static Shape arrayOfShapes[];
	
	public static void main(String[] args) {
		int w;  //너비
		int h;   //높이
		Scanner input = new Scanner(System.in);
		
		System.out.print("너비를 입력하시오: ");
		w = input.nextInt();
		System.out.print("높이를 입력하시오: ");
		h = input.nextInt();
	
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Triangle(w, h);
		arrayOfShapes[1] = new Rectangle(w, h);
		arrayOfShapes[2] = new Circle(w, h);
		
		for (int i=0; i<arrayOfShapes.length; i++) {
			System.out.println(arrayOfShapes[i].area());
		}
	}

}
