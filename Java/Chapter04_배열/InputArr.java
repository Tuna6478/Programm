package Chapter04;

import java.util.Arrays;

public class InputArr {

	public static void main(String[] args) {//			02
		
//		배열 값 불러오기
		
//		배열 값 출력하기
		
//		10개 짜리 방 생성
		int[] socres = new int[10];
		
		System.out.println("크기 : "+socres.length);  //length : 배열의 길이 표시
		
		socres[0] = 10; // 0번 방에 10
		socres[1] = 50; // 1번 방에 50
		socres[2] = 70; // 2번 방에 70
		
//		3번방 부터 끝까지 100씩 넣기
		socres[3] = 100;
		socres[4] = 100;
		socres[5] = 100;
		socres[6] = 100;
		socres[7] = 100;
		socres[8] = 100;
		socres[9] = 100;
		
//		값을 자동으로 추가
		for (int i = 3; i < socres.length; i++) { // i가 3부터 socres보다 배열 길이가 짧을 때 까지 
			socres[i] = 100; //socres[i] 에 100을 대입한다.
		}

//		문 : socres에 값을 전부 출력 할려면?
		for (int i = 0; i < socres.length; i++) {
			System.out.println(socres[i]);
		}
		
		System.out.println("-----------------------");
		
//		Arrays.toStrinf(배열이름) 으로도 출력이 가능하다
		System.out.println(Arrays.toString(socres));
		
	}

}
