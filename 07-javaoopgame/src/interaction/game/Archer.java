package interaction.game;

public class Archer {
	private int hp;
	private int ap;
	private int dp;
	private int mp;
	private int level;
	private int exp;
	
	public Archer() {
		this.hp = 20;
		this.mp = 10;
		this.ap = 4;
		this.dp = 1;
		this.level = 1;
		this.exp = 0;
	}
	public void huntOrc(Orc orc) {
		// 공격 전에 먼저 오크의 체력을 체크해서 죽은 오크라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(orc.getHp() <= 0) {
			System.out.println("이미 죽은 오크를 공격할 수 없습니다.");
			return;
		}
		// 오크와 전투를 할 때는 자신의 공격력을 넘깁니다.
		orc.doBattle(this.ap);
		// 오크쪽 처리가 되고 나서 유저가 공격을 받았을 때
		// 유저가 죽는 상황이라면 역시 전투 메서드 종료
		if(orc.getAtk() > (this.hp + this.dp)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 오크가 죽었다면 경험치 20을 획득
		if(orc.getHp() <= 0) {
			System.out.println("경험치를 20 획득했습니다.");
			this.exp += 20;
			System.out.println("오크와의 교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.dp) - orc.getAtk();
		System.out.println("오크와의 교전 완료!");
		
	}
	// 특정 몬스터인 트롤을 공격하는 공격 메서드	
	public void huntTrole(Trole trole) {
		// 공격 전에 먼저 트롤의 체력을 체크해서 죽은 트롤이라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(trole.getHp() <= 0) {
			System.out.println("이미 죽은 트롤을 공격할 수 없습니다.");
			return;
		}
		// 트롤과 전투를 할 때는 자신의 공격력을 넘깁니다.
		trole.doBattle(this.ap);
		if(trole.getAtk() > (this.hp + this.dp)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 트롤이 죽었다면 경험치 25을 획득
		if(trole.getHp() <= 0) {
			System.out.println("경험치를 25 획득했습니다.");
			this.exp += 25;
			System.out.println("트롤과의 교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.dp) - trole.getAtk();
		System.out.println("트롤과의 교전 완료!");
	}
	
	// 특정 몬스터인 드래곤을 공격하는 공격 메서드	
	public void huntSlame(Slame slame) {
		// 공격 전에 먼저 슬라임의 체력을 체크해서 죽은 트롤이라면
		// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
		if(slame.getHp() <= 0) {
			System.out.println("이미 죽은 슬라임을 공격할 수 없습니다.");
			return;
		}
		// 슬라임과 전투를 할 때는 자신의 공격력을 넘깁니다.
		slame.doBattle(this.ap);
		if(slame.getAtk() > (this.hp + this.dp)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		// 만약 전투 도중 슬라임이 죽었다면 경험치 50을 획득
		if(slame.getHp() <= 0) {
			System.out.println("경험치를 50 획득했습니다.");
			this.exp += 50;
			System.out.println("슬라임과의 교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.dp) - slame.getAtk();
		System.out.println("슬라임과의 교전 완료!");
	}
	public void huntOgresse(Ogresse ogresse) {
		if(ogresse.getHp() <= 0) {
			System.out.println("이미 죽은 오우거를 공격할 수 없습니다.");
			return;
		}
		
		ogresse.doBattle(this.ap);
		
		if(ogresse.getAtk()>(this.hp+this.dp)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		
		if(ogresse.getHp()<=0) {
			System.out.println("경험치를 55를 획득했습니다.");
			this.exp += 55;
			System.out.println("오우거과의 교전 완료!");
			return;
		}
		// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
		this.hp = (this.hp + this.dp) - ogresse.getAtk();
		System.out.println("오우거과의 교전 완료!");
	}
	
	public void showStatus() {
		System.out.println("<<궁수에 정보입니다.>>");
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
		System.out.println("공격력 : " + this.ap);
		System.out.println("방어력 : " + this.dp);
		System.out.println("레벨: " + this.level);
		System.out.println("경험치 : " + this.exp);
		System.out.println("-------------");
	}


	
	
	
}
