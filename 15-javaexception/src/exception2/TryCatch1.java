package exception2;

import java.util.Scanner;

public class TryCatch1 {

	public static void main(String[] args) {
		// try~catch구문은 크게 예외가 발생할 수 있는 구문을 적는
		// try블럭과, 예외 발생시 처리할 catch블럭으로 나뉩니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1번 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int b = scan.nextInt();
		
		
	}
}
