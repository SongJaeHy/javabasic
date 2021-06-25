import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// 주어진 변수 a에 스캐너로 정수값을 입력받게 만들어주세요.
		// 입력받은 정수가 0이상이면 "0보다 크거나 같습니다"를
		// 그렇지 않다면 "0보다 작습니다"를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주새요.");
		int a = scan.nextInt();
		
		if (a >= 0) {
			System.out.println("입력된 수는 0보다 크거나 같습니다.");
		}if(a < 0) {
			System.out.println("입력된 수는 0보다 작습니다.");
		}
		scan.close();
	}
}
