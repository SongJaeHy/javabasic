package interface1;

public class Main1 {

	public static void main(String[] args) {
		// 자동차 생성 및 사용\
		// 생성시 Car타입 하나와
		// Vehicle 타입 하나
		Vehicle v1 = new Car("타다요"); 
		v1.accel();
		v1.showStatus();
		
		Car c1 = new Car("다다");
		c1.breakSpeed();
		c1.showStatus();
	}

}
