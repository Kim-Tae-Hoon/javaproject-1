import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Problem_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] queue = new char[5];
		int rear = 0;

		char carName = 'A';
		int select = 9;

		while (select != 3) {
			System.out.printf("<1> 넣기 <2> 빼기 <3> 종료");
			select = s.nextInt();

			switch (select) {
			case 1:
			case 2:
			case 3:
			default:

			}
		}

	}

}
