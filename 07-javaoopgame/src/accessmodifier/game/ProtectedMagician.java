package accessmodifier.game;

public class ProtectedMagician extends ProtectedCommoner{

	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		hp = hp-2;
		exp = exp+15;
	}

	public void FireBall() {
		System.out.println("마법사가 파이어볼을 씁니다.");
		mp = mp+4;
		exp = exp+10;
	}

	public void getAlldata() {
		System.out.println("체력 :"+hp);
		System.out.println("마나 :"+mp);
		System.out.println("레벨 :"+level);
		System.out.println("경험 :"+exp);
		System.out.println("----------");
		
	}
	
}
