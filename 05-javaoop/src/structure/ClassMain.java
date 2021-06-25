package structure;

public class ClassMain {

	
	
	
	
	
	public static void main(String[] args) {
		// Person 2명을 만들어보겠습니다.
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		// Person 2명 정보를 직접 기입해주세요.
		person1.name = "채종훈";
		person1.age = 99;
		person1.pNum = "010-1234-1234";
		person1.address = "서울";
		person1.glasses = true;
		person2.name = "가나다";
		person2.age = 12;
		person2.pNum = "010-3456-7890";
		person2.address = "제주";
		person2.glasses = false;
		//정보를 조회해보겠습니다.
		person1.getInfo();
		person2.getInfo();
		

	}

}
