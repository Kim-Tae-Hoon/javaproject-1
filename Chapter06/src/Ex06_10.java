import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int hap = 0; // �հ� ���� ����
		int i; // ���� ����
		int num; // �Է� ���� ���� ��

		System.out.printf("�� �Է� : ");
		num = s.nextInt();

		for (i = 1; i <= num; i++) {
			hap += i;
		}
		System.out.printf("1���� %d������ �� : %d\n", num, hap);

	}

}
