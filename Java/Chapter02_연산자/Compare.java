package Chapter02;

public class Compare {

	public static void main(String[] args) {
		
//		( = ) 은 대입 연산으로 사용 중
		int v1 = 1;
		double v2 = 1.0;
		int v3 = 4;
		
//		문자열은 여러가지 방법으로 선언 할 수 있다.
		String v4 = "Java";
		String v5 = new String("Java"); // 얘는 아직 잘 모드겠다.
		
//		비교 연산 - 비교 연산은 항상 왼쪽을 기준이다.
		System.out.println(v1 == v2); // 같은지 검사
		
//		!논리부정 연산자 - true -> false로 변환한다. (혹은 반데로 변환) | 다른지 검사
		System.out.println(v1 != v2); 
		System.out.println(v1 < v2); 			// v1가 v2보다 작은지 검사
		System.out.println(v4 == v5);		// 문자열은 다른 연산자로 비교
		System.out.println(v4.equals(v5)); // 문자열 비교는 반드시 .equals() 로 해 주기
		
		String id = "admin";
		String pw = "pass";
		
//		입력받은 id 와 pw 가 각각 admin과 pass면 로그인 완료 시켜주기
		if (id.equals("admin") && pw.equals("pass")) { // if = 조건문( 조건에 따라 작동) | &&(AND) 조건 다 만족 해야함
			System.out.println("로그인 성공");  // if 조건에 만족하면 실행
		}

	}

}
