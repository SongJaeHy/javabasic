package accessmodifier.game;

public class Archer extends Commoner{
	public void hunt() {
		System.out.println("궁수가 사냥을 시작합니다.");
		setHp(getHp()-4);
		setExp(getExp()+10);
	}
	public void MutilShot() {
		System.out.println("궁수가 멀티샷을 씁니다.");
		setMp(getMp()+2-4);
		setExp(getExp()+15);
	}
	public void threeShot() {
		System.out.println("궁수가 쓰리샷을 씁니다.");
		setMp(getMp()+4);
		setExp(getExp()+20);
	}
	public void getAlldata() {
		System.out.println("체력 :" + getHp());
		System.out.println("마나 :" + getMp());
		System.out.println("레벨 :" + getLevel());
		System.out.println("경험 :" + getExp());
		System.out.println("------------");
	}
}
