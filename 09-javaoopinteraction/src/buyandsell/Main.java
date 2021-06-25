package buyandsell;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Seller b2 = new Seller(20);
		b2.sellMango(100);
		b2.showSeller();
		b2.sellMango(15);
		b2.showSeller();
		
		MellonSeller b3 = new MellonSeller(20);
		b3.showSeller();
		b3.sellmellon(10);
		
	}

}
