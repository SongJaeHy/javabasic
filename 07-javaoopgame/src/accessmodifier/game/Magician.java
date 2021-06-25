package accessmodifier.game;

public class Magician extends Commoner{
	
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	public void fireBall() {
		System.out.println("마법사가 파이어볼을 씁니다.");
		setMp(getMp()-4);
		setExp(getExp()+20);
	}
	public void Storm() {
		System.out.println("마법사가 전기마법을 씁니다.");
		setMp(getMp()+2);
		setLevel(getLevel()+1);
	}
	public void getAlldata() {
		System.out.println("체력 :" + getHp());
		System.out.println("마나 :" + getMp());
		System.out.println("레벨 :" + getLevel());
		System.out.println("경험 :" + getExp());
		System.out.println("---------------") ;
	}
}
