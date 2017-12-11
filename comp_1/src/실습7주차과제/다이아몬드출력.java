// *모양을 이용해 다이아몬드형으로 출력하는 프로그램 / for문 이용
package 과제;

public class 다이아몬드출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int y=1;y<6;y++){
			for (int x=y;x<6;x++){
				System.out.print(" ");
			}
			for (int x=1;x<y;x++){
				System.out.print("*");
			}
			for (int x=1;x<y-1;x++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int y=1;y<6;y++){
			for (int x=1;x<y;x++){
				System.out.print(" ");
			}
			for (int x=y;x<6;x++){
				System.out.print("*");
			}
			for (int x=y+1;x<6;x++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

