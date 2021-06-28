package accessmodifier2;

public class Main {
	public static void main(String[] args) {
		//Parent르 ㄹ상속받은 Child 내부의 자료 조회
		Child child = new Child();
		// 1. public 자료
		System.out.println(child.a);
		//2. protected 자료
		// 현재 main.java와 같은 패키지 내부에 Parent, Child
		//가 존재하므로 protected 접근 가능
		System.out.println(child.b);
		// 3. private 자료
		//System.out.println(child.c);
		
		//4. default 자료
		System.out.println(child.d);
	}
}