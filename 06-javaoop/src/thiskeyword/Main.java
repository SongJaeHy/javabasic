package thiskeyword;

public class Main {
	public static void main(String[] args) {
		//this가 적용된 Person 생성하기
		//생성시 Ctrl + Space를 누르면 입력하 요소가 출력됨
		
		
		Person p1 = new Person(
				"채종훈", 20, 3000, "통계학");
		p1.getInfo();
		
		// Person객체를 하나 더 임의로 생성해주세요.
		Person p2 = new Person(
				"김이박", 40, 5000, "수학");
		p2.getInfo();
	}
}
