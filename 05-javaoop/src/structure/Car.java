package structure;

public class Car {
	public String model;
	public int price;
	public String owner;
	
	public void getInfo() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
		System.out.println("주인 : " + owner);
	}
}
