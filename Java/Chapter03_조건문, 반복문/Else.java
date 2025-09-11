package Chapter03;

public class Else {

	public static void main(String[] args) {
//		if 에 있는 조건을 만족 시키지 못할 경우에 쓰인다.
		
		System.out.println("가계에 간다.");
		
		int tofuBox = 0 ;
		
		
		/* 여러가지 조건을 계산 하는 법
		 * if (tofuBox >0) { 
		 * 			System.out.println("두부를 사온다."); 
		 * }
		 * 
		 * if (tofuBox < 1) { 
		 *         System.out.println("순두부를 사온다."); 
		 * }
		 * 
		 * 이렇게 사용하면 중간에 어떤 구문도 실행되지 않는 부분이 생긴다
		 * 경계선 값 오류 : n 값이ㅣ 포함이 되질 않아서다
		 */
		
		if (tofuBox > 0) {
			System.out.println("두부를 사온다.");
		} else { //else를 사용하면 코드가 줄어든다.
			System.out.println("순두부를 사온다.");
		}
		
		System.out.println("집으로 온다.");

	}

}
