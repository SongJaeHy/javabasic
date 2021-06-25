import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double rate = 1117.40;
		System.out.println("미국 달러의 환율은" + rate + "입니다.");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
		
		System.out.println("원화" + won + "원을 미국 달러로 환전시");
		System.out.println(Math.round(won / rate) + "달러입니다.");
		//System.out.println(String.format("%.2f", (won / rate)) + "달러입니다.");
		
		scan.close();		
	}
}
