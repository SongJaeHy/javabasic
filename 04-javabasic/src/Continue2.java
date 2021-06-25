import java.util.Scanner;

public class Continue2 {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("목표 정수를 입력해주세요.");
		int n = scan.nextInt();
		
		int total = 0;
		int count = 0;
		
		while(count < n) {
			count += 1;
			//3. 짝수면 스킵
			if(count % 2 ==0) {
				continue;
			}
			//4. 홀수면 총합 더하기
			total += count;
			//5. 진행상활 콘솔에 찍기
			System.out.println("현재 1부터" + count + "까지 더했습니다.");
			System.out.println("총합은" + total + "입니다.");
		}
		scan.close();
	}
}
