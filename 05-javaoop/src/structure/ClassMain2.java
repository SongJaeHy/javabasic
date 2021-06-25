package structure;

public class ClassMain2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.model = "K5";
		car1.price = 30000000;
		car1.owner = "채종훈";
		car2.model = "제네시스 지구공";
		car2.price = 90000000;
		car2.owner = "현기차";
		
		car1.getInfo();
		car2.getInfo();
	}
}
