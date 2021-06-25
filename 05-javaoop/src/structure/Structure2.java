package structure;

public class Structure2 {
	
	//Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}
	
	public static void getCatInfo(Cat c) {
		System.out.println("고양이 이름:" + c.name);
		System.out.println("고양이 나이:" + c.age);
		System.out.println("고양이 품종:" + c.type);
	}
	
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		Person a = new Person();
		a.name = "채종훈";
		a.age = 20;
		a.pNum = "010-1234-5678";
		a.address = "서울";
		Person b = new Person();
		b.name = "페이커";
		b.age = 15;
		b.pNum = "010-4321-9876";
		b.address = "부산";
		getInfo(a);
		getInfo(b);
		System.out.println("--------------------");
		Cat catA = new Cat();
		catA.name = "야옹이";
		catA.age = 1;
		catA.type = "가필드";
		Cat catB = new Cat();
		catB.name = "멍멍이";
		catB.age = 3;
		catB.type = "코숏";
		
		getCatInfo(catA);
		getCatInfo(catB);

	}

}
