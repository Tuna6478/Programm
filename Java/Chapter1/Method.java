package Chapter01;

public class Method {

		/* [반환 타입] [메서드 이름] ([매개변수]) {
		 * 			실행문;
		 * 		return [반환문];
		 * }
		 * */
		
//		메서드 : 동작을 실행해 주는 무언가
		
//		반환타입 O, 매개변수 O
		String 토스트기(String 빵) {
			return "구운 + 빵";
		}
		
//		반환타입 O, 매개변수 X
		String 번호표기계() {
			return "번호표";		
		}
		
//		반환타입 X, 매개변수 O
		void 저금통(int 동전) {
			System.out.println(동전+" 저금");
		}
		
//		반환타입 X, 매개변수 X
		void 호출벨() {
			System.out.println("호출");
		}

	}
		

