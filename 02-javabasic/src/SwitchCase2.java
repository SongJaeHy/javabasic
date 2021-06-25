
public class SwitchCase2 {

	public static void main(String[] args) {
		// Math.random(); 을 이요해 난수를 하나 발급받을 수 있고
		// 난수의 범위는 0초과 1미만입니다.
		double number= Math.random();
		
		// 뒤에 숫자를 곱하면 원하는 범위릐 정수르 얻을 수 있습니다.
		int intNum = (int)(Math.random() * 8);
		System.out.println(intNum);
		
		//Switch~Case문을 이용해서
		//식당 이름을 출력하는 프로그램을 만들어보세요.(최소6개)
		switch(intNum) {
		case 0:
			System.out.println("스시소라");
			break;
		case 1:
			System.out.println("몽준헌");
			break;
		case 2:
			System.out.println("일일향");
			break;
		case 3:
			System.out.println("코끼리분석");
			break;
		case 4:
			System.out.println("싸다분식");
			break;
		case 5:
			System.out.println("미분당");
			break;
		case 6:
			System.out.println("서가네");
			break;
		default:
			System.out.println("??????");
			break;
		}
		
	}
}


