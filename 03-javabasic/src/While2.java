import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		//스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자"를 입력받게 해 주세요.
		//이 문자자료 num을 int loop 변수에 정수로 변환해 저장하세요.
		//loop 변수에 입력된 정수 횟수만큼
		//"반복문을 실행합니다 (횟수)"라는 문장이 콘솔에 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		String num = scan.next();
		int loop = Integer.parseInt(num);
		
		int count = 0; //몇 번 돌아야 하는지 선언을 해줘야 한다
		
		while(count < loop) {
			count +=1;
			System.out.println("반복문을 실행합니다." + count);
		}//처음에는 true였는데 나중에는 false가 되어야 한다.
		scan.close();
	}
}
