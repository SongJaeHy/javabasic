package exception2;

public class TryCatch2 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		int[] arr = new int[5];
		for(int a : arr) {
			System.out.println(a);
		}
		String str = "3";
		Object obj = str;
		
		
		try {
			System.out.println(arr[10]);
		}catch(Exception e) {
			System.out.println("문자를 넣을 수 없습니다.");	
		}
		try {
			Integer interger = (Integer)obj;
		}catch(Exception e) {
			System.out.println("정수로 바꿀수 없습니다.");
		}
	}
}
