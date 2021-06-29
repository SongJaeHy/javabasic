package interface1;

public class Main2 {

	public static void main(String[] args) {
		Vehicle m1 = new Motorcycle("오토바이");
		Vehicle c1 = new Cycle("자전거");
		
		m1.accel();
		m1.showStatus();
		c1.accel();
		c1.showStatus();
		
		
		Motorcycle m2 = new Motorcycle("내가 탄다");
		Cycle c2 = new Cycle("운동하자");
		
		m2.breakSpeed();
		m2.showStatus();
		c2.accel();
		c2.showStatus();

	}

}
