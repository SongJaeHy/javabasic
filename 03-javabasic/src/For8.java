
public class For8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j =4; j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else
					System.out.print("*");
			}System.out.println("");
		}
		for(int i= 1; i <5; i++) {
			for(int j =1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
