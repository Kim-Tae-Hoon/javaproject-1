import java.util.Scanner;

public class Ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int hap = 0;
		int i;
		int num1, num2, num3;

		System.out.printf("���۰� : ");
		num1 = s.nextInt();

		System.out.printf("���� : ");
		num2 = s.nextInt();

		System.out.printf("������ : ");
		num3 = s.nextInt();

		for (i = num1; i <= num2; i = i + num3) {
			hap += i;
		}
		System.out.printf("%d���� %d���� %d�� ������ ���� �� %d", num1, num2, num3, hap);
	}

}
