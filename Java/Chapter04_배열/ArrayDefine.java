package Chapter04;

public class ArrayDefine {

	public static void main(String[] args) { 				// 01
		
//		배열 정의
		
//		선언과 동시에 값을 넣는 방법
		int[] score = {70,80,90}; // 크기 : 3,  주소 : 0,1,2
		String names[] = {"홀길동","고길동","박길동"};
		
//		new 연산자로 값을 추가하는 방법
		int[] scores; // 이렇게 만 해서는 사용 불가.
		scores = new int[] {70,80,90}; // 얘는 불편해서 잘 사용하지 않는거 같다.
		
//		new 연산자로 바로 선언하는 방법
		int[] arr = new int[6];
	
		
	}

}
