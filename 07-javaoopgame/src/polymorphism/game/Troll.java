package polymorphism.game;

public class Troll extends Monster{
	public Troll() {
		super("트롤",40,10,5);
	}
	public void doBattle(int uAtk) {
		setHp(getHp() + getDp() - uAtk);
		if(getHp() <= 0) {
			System.out.println("트롤 몬스터는 죽었습니다.");
		}
	}
}
