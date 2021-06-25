package constructor;







public class BasketballPlayer {
	public int height;
	public int jumpHeight;
	
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println(
				"농구선수 생성 완료 : 키 =" + height + 
				",점프력 =" + jumpHeight);
	}
	
	public void dunkShoot() {
		if(height + jumpHeight > 300) {
			System.out.println("덩크슛에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
	
}
