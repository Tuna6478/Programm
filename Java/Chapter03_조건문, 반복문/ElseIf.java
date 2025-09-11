package Chapter03;

public class ElseIf {

	public static void main(String[] args) {
		
//		우리가 기지고 있는 음료수 : 콜라, 생수, 오렌지주스, 사이다, 에너지음료, 냉커피, 식혜
		String item = "켄커피";
		
//		item 의 값이 가지고 있느 음료이면 000 이 나왔습니다. 출력
		
		/* 문제 : item이 가지고 있는 음료 출력
		 * 사용코드 : if, else if, .equals
		 * 문제 풀이 : 조건을 다 비교한다.
		*/

		if (item.equals("콜라")) {
			System.out.println(item+"가 나왔습니다.");
		}else if (item.equals("생수")) {
			System.out.println(item+"가 나왔습니다.");
		}else if (item.equals("오렌지주스")) {
			System.out.println(item+"가 나왔습니다.");
		}else if (item.equals("사이다")) {
			System.out.println(item+"가 나왔습니다.");
		}else if (item.equals("에너지음료")) {
			System.out.println(item+"가 나왔습니다.");
		}else if (item.equals("냉커피")) {
			System.out.println(item+"가 나왔습니다.");
		}else if (item.equals("식혜")) {
			System.out.println(item+"가 나왔습니다.");
		}else {
			System.out.println(item+"은 보유하지 않고 있습니다.");
		}
		
		
	}

}
