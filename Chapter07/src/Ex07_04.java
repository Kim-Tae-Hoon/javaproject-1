import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int a, b;
		char ch;
		while (true) {
			System.out.print("���� ù��° �� �Է� : ");
			a = s.nextInt();
			System.out.print("���� �ι�° �� �Է� : ");
			b = s.nextInt();
			System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d", a, b, a + b);
				break;
			case '-':
				System.out.printf("%d - %d = %d", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %d", a, b, a / (float) b);
				break;
			case '%':
				System.out.printf("%d %% %d = %d", a, b, a % b);
				break;
			default:
				System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�.\n");
			}
		}
	}
}
