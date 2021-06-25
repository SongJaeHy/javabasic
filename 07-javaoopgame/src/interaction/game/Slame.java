package interaction.game;

public class Slame {
	private int hp;
	private int ap;
	private int dp;
	
	public Slame() {
		this.hp = 15;
		this.ap = 5;
		this.dp = 0;
	}
	public void doBattle(int uAtk) {
		this.hp = (this.hp + this.dp) - uAtk;
		if(this.hp <= 0) {
			System.out.println("이 슬라임은 이미 죽었습니다.");
		}
	}
	
	public int getAtk() {
		return this.ap;
	}
	public int getHp() {
		return this.hp;
	}
	public void showStatus() {
		System.out.println("체력 :" + hp);
		System.out.println("공격력 :" + ap);
		System.out.println("방어력 :" + dp);
	}
}
