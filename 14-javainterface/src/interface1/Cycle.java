package interface1;

public class Cycle implements Vehicle{

	private int speed;
	private int Break;
	private String name;
	
	public Cycle(String name) {
		this.name = name;
		this.speed = 5;
		this.Break = 0;
	}
	
	@Override
	public void accel() {
		if(speed + 10 > 150) {
			speed = 100;
		} else {
			speed += 10;
		}
	}

	@Override
	public void breakSpeed() {
		if(speed - 10 < 0) {
			speed = 0;
		}else {
			speed -= 5;
		}
	}

	@Override
	public void reFuel() {
		if(Break + 20 > MAX_GAS) {
			Break = MAX_GAS;
		}else {
			Break += 10;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 자전거 속도 :" + speed);
		System.out.println("현재 자전거 연료 :" + Break);
		System.out.println("현재 자전거 주인 :" + name);
		System.out.println("-----------------");
		
	}

}
