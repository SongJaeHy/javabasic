package static2;

public class Main {
	public static void main(String[] args) {
		//Asean 조원 없이도 Asean 조별점수는 조회 가능
		//System.out.println(Asean.score);
		
		Asean a1 = new Asean(70,80,30);
		Asean a2 = new Asean(60,70,30);
		Asean a3 = new Asean(50,40,30);
		Asean a4 = new Asean(30,60,30);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}
}
