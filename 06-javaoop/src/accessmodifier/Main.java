package accessmodifier;

public class Main {
	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		// 사냥 3번 후에 전체 상태를 sysout을 이용해 출력해주세요.
		
		
		Warrior w1 = new Warrior("전사전사");
//		w1.hp = 1000000;
		w1.hunt();
		w1.hunt();
		w1.hunt();
//		System.out.println("아이디 : " + w1.id);
//		System.out.println("레벨 : " + w1.level);
//		System.out.println("체력 : " + w1.hp);
//		System.out.println("공격력 : " + w1.atk);
//		System.out.println("경험치 : " + w1.exp);
		
		Warrior w2 = new Warrior("호떡");
//		w2.hp = 1000000;
		w2.hunt();
		w2.hunt();
		
		
		
	}
}
