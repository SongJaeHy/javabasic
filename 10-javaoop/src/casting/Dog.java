package casting;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void bowWow() {
		System.out.println("개가 왈왈 짖습니다.");
	}

	public void walk() {
		System.out.println("개가 당당하게 걷습니다.");
	}
}
