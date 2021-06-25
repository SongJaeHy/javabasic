package polymorphism.game;

public class Monster {
	private String name;
	private int hp;
	private int ap;
	private int dp;
	
	public Monster(String name, int ap,int hp, int dp) {
		this.name = name;
		this.hp = hp;
		this.ap = ap;
		this.dp = dp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}
	
	public void showMonster() {
		System.out.println("공격력 :" + ap);
		System.out.println("방어력 :" + dp);
	}
}
