import java.util.Scanner;

public class Test07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, stWeight, weight;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ű�� �Է��ϼ��� : ");
		height = scan.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		weight = scan.nextDouble();

		stWeight = (height - 100) * 0.9;
		
		if(weight < stWeight)
			System.out.println("�����");
		else if(weight == stWeight)
			System.out.println("�ʴ� ǥ���̾�");
		else
			System.out.println("�ܲ�");

	}

}
