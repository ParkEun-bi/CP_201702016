package ����;
import java.util.Scanner;
public class ShapeTest {
	private static Shape arrayOfShapes[];
	
	public static void main(String[] args) {
		int w;  //�ʺ�
		int h;   //����
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ʺ� �Է��Ͻÿ�: ");
		w = input.nextInt();
		System.out.print("���̸� �Է��Ͻÿ�: ");
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
