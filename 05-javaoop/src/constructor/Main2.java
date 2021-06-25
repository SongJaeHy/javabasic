package constructor;

public class Main2 {
	public static void main(String[] args) {
		Cartoon ct1 = new Cartoon(
				"코딩왕 김코딩", 131, "코더", false);
		Cartoon ct2 = new Cartoon(
				"클로저 이상용", 756, "최훈", true);
		
		ct1.getInfo();
		ct2.getInfo();
	}
}
