import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ �Է� �޾Ƽ� �� ������ ��� ����� ����ϴ� ���α׷�
		// ���� ������ �Է� �Ͻÿ�: 100
		// 100�� ����� ������ �����ϴ�.
		// 1,2,4,5,10,20,25,50,100
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int n = scan.nextInt();
		
		System.out.println(n + "�� ����� ������ �����ϴ�.");
		for(int i = 1; i<=n;++i){
			if(n%i==0)
				System.out.print(" "+i);
		}

	}

}
