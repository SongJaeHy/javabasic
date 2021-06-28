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
	
	public void doBattle(int uAtk) {
		this.hp = (this.hp + this.dp) - uAtk;
		if(this.hp <= 0) {
			System.out.println(name + "몬스터는  죽었습니다.");
		}
	}
	public String getName() {
		return name;
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
	
	public int getDp() {
		return dp;
	}
}
