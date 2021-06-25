
public class Bonase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i< 60; i++) {
			for(int j=1; j<60; j++) {
				if((4*i)+(5*j)==60) {
					System.out.println("x의 해 :" + i);
					System.out.println("y의 해 :" + j);
					System.out.println("---------");
				}
			}
		}
	}

}
