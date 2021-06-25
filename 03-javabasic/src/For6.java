import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j=0; j<num;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}
