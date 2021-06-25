import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//Hello Java를 입력한 횟수만큼 출력하는 구문
		//입력은 Scanner로 받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반복 횟수를 입력해주세요.");
		int loop = scan.nextInt();
		for(int i = 1; i <= loop; i++) {
			System.out.println("Hello Java!" + i);
		}
		scan.close();
	}

}
