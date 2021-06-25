package superclass;

// 초음속 비행기는 비행기를 상속합니다.
public class SuperSonicAirplane extends Airplane {
	// 초음속비행기도 일반 비행기처럼 속도를 사용합니다.
	// 따라서 변수는 추가로 정의하지 않습니다.
	
	
	
	public SuperSonicAirplane(int s) {
		// Airplane의 생성자는 상속되지 않습니다.
		// 따라서 부모쪽의 생성자라는 의미로
		// super();를 사용하며 이 때 부모쪽에 넘겨줄 수치값도
		// 함께 받아서 처리해줍니다.
		super(s);
	}
	
	public void fly() {

		if(speed + 500 <= 900) {
			super.fly();
		}else {
			// 속도 900 이상 1300 이하인 경우 초음속 비행으로 호출
			if(speed + 500 >= 1300) {
				speed = 1300;
			}else {
				speed += 500;
			}
			System.out.println("초음속 비행 속도 :" + speed + "km/h");
		}
	}
	

}
