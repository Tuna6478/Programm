package Chapter01;

public class Casting_04 {

	public static void main(String[] args) { //얘가 없으면 프로그램이 스스로 실행되지 않는다.
		
		/*
		 * 캐스팅(형 변환) : 변수를 변경 할 수 있다.
		 * 작은컵, 중간컵, 큰컵, 와인잔
		 * 묵시적 캐스팅 : 작은거 -> 큰거 (내가 다른 변수로 변경한 다는 것을 알리지 않아도 됨)
		 * 명시적 캐스팅 : 큰거 -> 작은거 (내가 들어간다고 명시해야 됨)
		 * */
		
//		 변수선언, 변수 이름 지정
		char charValue; 			//한글자
		int intValue; 				//정수 (월급)
		long longValue;			//큰 전수 (연봉)
		float floatValue;			//float 는 특수하게 f를 붙여준다.
		double doubleValue;	//큰 소숫점 (일반적으로 소수점 5자리 이상)
		
//		변수에 값 지정
		intValue = 74;
		charValue = (char) intValue; //강제 타입변환
		System.out.println(charValue); // 출력문
		

		longValue = 500;
		doubleValue = 3.14;
		
//		강제 ( 명시적 ) 형 변환 
//		long -> int
		intValue = (int) longValue;
		
//		double -> float
		floatValue = (float) doubleValue;
		
//		출력문
		System.out.println(intValue);
		System.out.println(floatValue);

	}

}
