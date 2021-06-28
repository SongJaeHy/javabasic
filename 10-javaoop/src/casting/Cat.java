package casting;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);		
	}
	
	public void scratch() {
		System.out.println("고양이가 사람을 할큅니다.");
	}
	
	public void walk() {
		System.out.println("고양이가 얌전히 걸어갑니다.");
	}
}
