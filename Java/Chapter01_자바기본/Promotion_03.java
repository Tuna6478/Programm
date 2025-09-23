package Chapter01;

public class Promotion_03 {

	public static void main(String[] args) {
//		작은거에서 큰걸로 갈땐 묵시적 형변화(Promotion) 이 된다.
//		왜? 작은잔에서 큰잔으로 옮길때 당연히 안 흘릴테니 확인이 필요 없다.
		
		byte byteValue;
		char charValue = 'a';
		int intValue = 0;
		long longValue;
		float floatValue;
		double doubleValue;
		
//		기본 허용범위 크기 byte<short<int<long<float<double
		
//		byte <  int
		byteValue =10;
		intValue = byteValue;
		
		// char < int
		intValue = charValue;
		System.out.println(intValue); // 97 -> ASCII CODE ( 각 문자의 번호가 공통 규격으로 정해져 있다.)
		//숫자에서 문자로 Casting는 않된다. 리터럴이 시작하는 곳이 다르기 때문이다.
		
		//int< long
		longValue = intValue;
		
		//float < double
		floatValue = 0.1f;
		doubleValue =floatValue;
		

	}

}
