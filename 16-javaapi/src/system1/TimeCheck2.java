package system1;

public class TimeCheck2 {

	public static void main(String[] args) {
		// tryCatch구문의 소요시간을 구해주세요.
		// 여러분들이 직접 원하는 종류의 예외를 발생시켜주세요.
		long start = System.currentTimeMillis();
		System.out.println(start);
//		long all = 0;
//		
//		try {
//			for(int i = 0; i < 2000000000; i++){
//				all += i;
//
//			}
//			long end = System.currentTimeMillis();
//			System.out.println(end);
//			// 소요 시간 측정
//			System.out.println(end - start);	
//		}catch(Exception e){
//			System.out.println("변수를 바꿀 수 없습니다.");
//		}finally {
//			System.out.println("초과 합니다.");
//		}
		try {
			throw new ArrayIndexOutOfBoundsException();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		// 소요 시간 측정
		System.out.println(end - start);	

	}

}
