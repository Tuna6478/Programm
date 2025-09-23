package Chapter01; //지금 있는 페키지 장소

public class Define_01 { //지금 자바 소스파일 이름 

	public static void main(String[] args) { // 얘가 없으면 프로그램이 스스로 실행 되지 않는다.
		/*
		 * 여러줄 주석
		 * 여러 줄을 사용 할때 쓴다.
		 * 
		 * 아! 그리고 이클립스 자동 완성 도 됨 -> 노션 확인
		 * 
		 * */
		
		//src : 소스파일
		//bin : 바이트코드 파일 (컴파일이 실행된 것)
		
		//변수에 기본 타입 [변수 타입] [변수 이름] = [변수 안의 값];
		boolean varBool = true; //변수 지정 하는 법 ( 논리 자료형 (true, false)
//		; <- 문장이 끝났다는 뜻
		
//		여러 글자 ( 더블 쿼터 )
		String varString = "문자열";
		
		byte varByte = 12; // 1byte(8bit(2⁸=256))
		
//		한글자 ( 싱클 쿼터 )
		char varchar = 's'; // 2바이트
		
//		일반 정수 
		int varint = 1;
		
//		큰 정수 
		long varlong = 10000000000L; //long는 뒤에 L(l) 을 붙여야 한다.
		
//		큰 소숫점 ( 일반적으로 소숫점 5자리 이상 )
		double vardouble = 0.00001;
		
//		float  은 특수하게 f 를 붙여준다.
		float varfloat = 0.1f;
		
		

	}

}
