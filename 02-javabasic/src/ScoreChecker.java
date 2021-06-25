import java.util.Scanner;

public class ScoreChecker {

	public static void main(String[] args) {
		// 성적 판독기를 만든다.
		// if~else if~else구문 사용
		// 성적기준은 95점이상 A+, 90이상 A0, 85이상 B+
		// 80이상 B0, 75이상 C+, 70이상 C0, 65이상 D+,
		// 60이상 D0, 60미만 F로 프린트구문 콘솔
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력해주세요.");
		
		int score = scan.nextInt();
		
		if(score >= 95) {
			System.out.println("A+입니다.");
		}else if(score >= 90) {
			System.out.println("A0입니다.");
		}else if(score >=85) {
			System.out.println("B+입니다.");
		}else if(score >=80) {
			System.out.println("B0입니다.");
		}else if(score >=75) {
			System.out.println("C+입니다.");
		}else if(score >=70) {
			System.out.println("C0입니다.");
		}else if(score >=65) {
			System.out.println("D+입니다.");
		}else if(score >=60) {
			System.out.println("D0입니다.");
		}else {
			System.out.println("F입니다.");
		}
	}
}
