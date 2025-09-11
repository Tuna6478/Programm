package Chapter03;

public class For {

	public static void main(String[] args) {
//		for(이녀석이 ; 이것을 만족한다면 ; 증가 또는 감소 )
//		for 은 반복 횟수가 정해진 상태가 적합
		
//		물 10잔을 떠 오기
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i+"잔");
//		}
		
		
//		커피 10잔 만들기 ( 물1 커피2)
//		특정한 반복이 있고 그안에 또라른 반복이 있을떄 
		for (int i = 1; i <= 10; i++) {
			System.out.println("물 "+i+" 잔을 떠왔습니다");
			for (int j = 1; j <=2 ; j++) { // false가 나올떄 까지 못 나감 ㅎㅎ
				System.out.println("믹스 "+j+"개 첨가");
			}
		}
		
	}

}
