package Chapter01;

public class Scope_02 {
	
	String string = "some test"; //전역변수 class 안에서 사용 가능

	public static void main(String[] args) { //method, function
		
		
		/*
		 * 핵심 키워드 : Scope, 지역변수, 전역번수, 메소드(블럭)
		 * Scope : 선언된 곳 보다 바깥쪽 영역에서는 사용 불가능 하다.
		 * 지역변수 : 메서드 안에서만 사용 가능 (지역화페)
		 * 전역변수 : 아무데나 사용 가능 (현금)
		 * 변수를 선언할 떄 해당 변수가 속한 범위 안쪽 블록은 사용 가능
		 * 	반대로 안쪽이 아니라 밖에서 사용 할수 없다 -> 이 경계를 Scope 이다.
		 * 간단 : 밖에 있는 건 안으로 들어갈 수 있다 / 안에 있는건 밖으로 갈 수 없다.
		 * */
		
		int num =123; //method 안에서 사용 가능
		
		for (int i = 0; i < 5; i++) { //문장(statement)
			int sum = num + i; //statement 안에서만 사용 가능
			System.out.println(sum);
		}
//		System.out.println(sum);  sum은 for 문장을 넘어갈 수 없으므로 에러
		
	}

}
