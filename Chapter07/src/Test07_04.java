import java.util.Scanner;

public class Test07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, min;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		x = scan.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		y = scan.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		z = scan.nextInt();

		if (x < y) {
			if (z < x)
				min = z;
			else
				min = x;
		}
		else {
			if(z<y)
				min = z;
				else
					min = y;
		}
	System.out.printf("���� ���� ������ %d\n", min);
	}

}
