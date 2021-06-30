package string1;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// .length()와 charAt()을 활용해 입력된 전체 문자열을
		// 한 글자씩을 한줄씩 출력하는 로직을 작성해보세요.
		// 문자열은 Scanner로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		
		String name = scan.nextLine();
		for(int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
	}

}
