package map1;

import java.util.HashMap;
import java.util.Map;

public class HasgMap2 {

	public static void main(String[] args) {
		//  식당 메뉴판을 만들어보새요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요
		// 메뉴를 3개 조회헤사 화면에 출력
		Map<String, Integer> menu = new HashMap<>();
		menu.put("짜장면", 5000);
		menu.put("돼지국밥", 6000);
		menu.put("순두부찌개", 7000);
		menu.put("김밥", 3000);
		menu.put("라면", 3500);
		System.out.println(menu);
		
		System.out.println(menu.get("짜장면"));
		System.out.println(menu.get("김밥"));
		System.out.println(menu.get("라면"));
		

	}

}
