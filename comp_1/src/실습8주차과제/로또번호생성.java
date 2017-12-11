package 과제;

import java.util.Random;

public class 로또번호생성 {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());

		int num1 = 0; // 로또번호를 변수로 저장
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int b = 6; // 6번 횟수를 나타내는 변수

		for (int i = 0; i < b; i++)   //6번 반복
		{ 
			num1 = (int) (Math.random() * 45) + 1;
			num2 = (int) (Math.random() * 45) + 1;
			num3 = (int) (Math.random() * 45) + 1;
			num4 = (int) (Math.random() * 45) + 1;
			num5 = (int) (Math.random() * 45) + 1;
			num6 = (int) (Math.random() * 45) + 1;

			if (num1 == num2) {
				num2 = (int) (Math.random() * 45) + 1;
				b++;
			}
			if (num1 == num3) {
				num3 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num2 == num3) {
				num3 = (int) (Math.random() * 45) + 1;
				b++;
			}
			if (num1 == num4) {
				num4 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num2 == num4) {
				num4 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num3 == num4) {
				num4 = (int) (Math.random() * 45) + 1;
				b++;
			}
			if (num1 == num5) {
				num5 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num2 == num5) {
				num5 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num3 == num5) {
				num5 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num4 == num5) {
				num5 = (int) (Math.random() * 45) + 1;
				b++;
			}
			if (num1 == num6) {
				num6 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num2 == num6) {
				num6 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num3 == num6) {
				num6 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num4 == num6) {
				num6 = (int) (Math.random() * 45) + 1;
				b++;
			} else if (num5 == num6) {
				num6 = (int) (Math.random() * 45) + 1;
				b++;
			}

		}
		System.out.println("<로또 생성 프로그램>");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
	}
}
