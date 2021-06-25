package overloading;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverTest o1 = new OverTest();
		OverTest o2 = new OverTest("2번함수");
		OverTest o3 = new OverTest(3);
		OverTest o4 = new OverTest("4번함수", 4);
		o1.showData();
		o2.showData();
		o3.showData();
		o4.showData();
	}

}
