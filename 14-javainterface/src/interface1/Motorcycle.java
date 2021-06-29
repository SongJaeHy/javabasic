package interface1;

public class Motorcycle implements Vehicle{

	private int Speed;
	private int fuel;
	private String name;
	
	public Motorcycle(String name) {
		this.name = name;
		this.fuel = MAX_GAS;
		this.Speed = 0;
	}
	
	
	@Override
	public void accel() {
		if(Speed + 20 > 200) {
			Speed = 200;
		}else {
			Speed += 20;
		}
		fuel -= 1;
		
	}

	@Override
	public void breakSpeed() {
		if(Speed - 20 < 0) {
			Speed = 0;
		}else {
			Speed -= 20;
		}
		
	}

	@Override
	public void reFuel() {
		if(fuel + 30 > MAX_GAS) {
			fuel = MAX_GAS;
		}else {
			fuel += 30;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("현재 오토바이 속도 :" + Speed);
		System.out.println("현재 오토바이 연료 :" + fuel);
		System.out.println("현재 오토바이 차주 :" + name);
		System.out.println("-----------------");
		
	}

}
