
public class Continue3 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58  3
 		//eng = 62, 42, 68, 31, 80, 77, 45   4
		// com = 10, 28, 39, 74, 65, 90, 98   4
		//각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요
		// 합격점수는 60점 이상입니다.
		int [] math = {96, 23, 52, 82, 72, 31, 58};
		int [] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		// 1. 총점 변수와 합격자수 변수 생성
		int total = 0;
		int count = 0;
		// 2. 반복문 실행
		for(int score: math) {
			// 3. 검사해서 60점 미만이면 contunue
			if(score <60) {
				continue;
			}else {
				// 4. 60점 이상이면 합격자수 +1, 총점에 합격점수 더하기
				count++;
				total += score;
			}
		}
		System.out.println("수학평균: " + total/count);
		
		total = 0;
		count = 0;
		for(int score: eng) {
			if(score < 60) {
				continue;
			}else {
				count++;
				total += score;
			}
		}
		System.out.println("영어평균: " + total/count);
		
		total = 0;
		count = 0;
		for(int score: com) {
			if(score < 60) {
				continue;
			}else {
				count++;
				total += score;
			}
		}
		System.out.println("컴퓨터평균: " + total/count);
			
		}
	}

