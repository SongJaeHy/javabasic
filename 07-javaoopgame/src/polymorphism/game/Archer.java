package polymorphism.game;

public class Archer {
	private int hp;
	private int ap;
	private int dp;
	private int mp;
	private int level;
	private int exp;
	
	public Archer() {
		 this.hp = 60;
		 this.mp = 30;
		 this.ap = 20;
		 this.dp = 5;
		 this.level = 1;
		 this.exp = 0;
	}
	
	public void MutilShot(Monster monster) {
		System.out.println("궁수가 멀티샷을 준비합니다.");
		if(mp < 5) {
			System.out.println("마나가 부족합니다.");
			return;
		}
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽은 몬스터를 공격할 수 없습니다.");
			return;
		}
		monster.doBattle(this.ap);
		monster.doBattle(this.ap);
		
		mp = mp -5;
		if(monster.getAp() > (this.hp + this.dp)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 몬스터가 죽었다면 경험치를 획득
		if(monster.getHp() <= 0) {
			System.out.println("경험치를 30 획득했습니다.");
			this.exp += 30;
			System.out.println(monster.getName()+"교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.dp) - monster.getAp();
		System.out.println(monster.getName()+"교전 완료!");
	}
	
	public void hunt(Monster monster) {
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽은 몬스터를 공격할 수 없습니다.");
			return;
		}
		monster.doBattle(this.ap);
		// 몬스터 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if(monster.getAp() > (this.hp + this.dp)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 몬스터가 죽었다면 경험치를 획득
		if(monster.getHp() <= 0) {
			System.out.println("경험치를 30 획득했습니다.");
			this.exp += 30;
			System.out.println(monster.getName()+"교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.dp) - monster.getAp();
		System.out.println(monster.getName()+"교전 완료!");
	}
		// 몬스터 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
	
	public void showStatus() {
		System.out.println("<<궁수의 상태입니다.>>");
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : " + this.ap);
		System.out.println("방어력 : " + this.dp);
		System.out.println("레벨: " + this.level);
		System.out.println("경험치 : " + this.exp);
		System.out.println("-------------");
	}
	
		
}
