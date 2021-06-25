package accessmodifier.game;

public class ProtectedArcher extends ProtectedCommoner{

	public void hunt() {
		System.out.println("궁수가 사냥을 시작했습니다.");
		hp = hp-2;
		exp = exp+15;
	}

	public void MultiShot() {
		System.out.println("궁수가 멀티샷을 씁니다.");
		mp=mp+2;
		exp=exp+20;
	}

	public void getAlldata() {
		System.out.println("체력 :"+hp);
		System.out.println("마나 :"+mp);
		System.out.println("레벨 :"+level);
		System.out.println("경험 :"+exp);
		System.out.println("-----------");
	}

	
}

