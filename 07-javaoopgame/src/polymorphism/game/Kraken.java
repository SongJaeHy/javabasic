package polymorphism.game;

public class Kraken extends Monster{
	public Kraken() {
		super("크라켄",30,10,5);
	}
	public void doBattle(int uAtk) {
		setHp(getHp() + getDp() - uAtk);
		if(getHp() <= 0) {
			System.out.println("크라켄 몬스터는 죽었습니다.");
		}
	}
}
