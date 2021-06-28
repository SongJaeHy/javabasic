package polymorphism.game;

public class Ogresse extends Monster{
	public Ogresse() {
		super("오우거",40,15,10);
	}
	public void doBattle(int uAtk) {
		setHp(getHp() + getDp() - uAtk);
		if(getHp() <= 0) {
			System.out.println("오우거 몬스터는 죽었습니다.");
		}
	}
}
