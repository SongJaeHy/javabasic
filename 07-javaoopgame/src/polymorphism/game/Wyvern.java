package polymorphism.game;

public class Wyvern extends Monster{
	public Wyvern() {
		super("와이번",50,20,10,45);
	}
	public void doBattle(int uAtk) {
		setHp(getHp() + getDp() - uAtk);
		if(getHp() <= 0) {
			System.out.println("좀비 몬스터는 죽었습니다.");
		}
	}
}
