import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int menu;

		// do~while
		do {
			System.out.printf("�ֹ��� �޴��� ������ �ּ���.\n");
			System.out.printf("<1>�� <2>īǪġ�� <3>�Ƹ޸�ī�� <4>�ֹ�����");

			menu = s.nextInt();

			switch (menu) {
			case 1:
				System.out.printf("#�󶼸� �ֹ��Ͽ����ϴ�.\n");
				break;
			case 2:
				System.out.printf("#īǪġ�븦 �ֹ��Ͽ����ϴ�.\n");
				break;
			case 3:
				System.out.printf("#�Ƹ޸�ī�븦 �ֹ��Ͽ����ϴ�.\n");
				break;
			case 4:
				System.out.printf("###�ֹ��Ͻ� Ŀ�Ǹ� �غ��մϴ�.\n");
				break;
			default:
				System.out.printf("�߸� �ֹ��Ͽ����ϴ�.");
			}
		} while (menu != 4);

	}
}
