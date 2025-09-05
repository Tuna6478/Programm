package Chapter01;

public class Toaster {

//	간단한 메서드 사용법
	
//	타입이 존제하지 않을 때 void라고 쓴다. (void : 공허, 아무것도 없다)
	public static void main(String[] args) {
		String dish= toaster("식빵"); // <- 얘가 toaster 이라는 메서드를 호출해 "식빵"을 입력으로 전달하고 반환 값을 dish 에 저장
		System.out.println(dish);
	}
	
//	메서드 선언
//	[아직 모름]
	static String toaster(String input) { // 준 값을 input에 저장 (얘가 toaster 에서 보낸 매개변수를 받는다.)
		System.out.println(input+"이 구어지고 있다.");
		return "구워진"+input;
	}

}
