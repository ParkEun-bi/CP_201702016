// *����� �̿��� ���̾Ƹ�������� ����ϴ� ���α׷� / for�� �̿�
package ����;

public class ���̾Ƹ����� {

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

