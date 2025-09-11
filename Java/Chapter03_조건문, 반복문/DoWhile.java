package Chapter03;

public class DoWhile {

	public static void main(String[] args) {
		
		// do while 은 일단 먼저 지르고 본다.
//		조건이 부합하지 않을 경우 다른 결과를 낸다.
//		버스에 카드를 찍고 타냐 일단 타고 내릴때 찍냐 차이
		
		int cnt = 11;
		
		while (cnt < 10) { //조건을 보고
			cnt++;// 실행을 한다.
		}
		System.out.println("whlie cnt : "+cnt);
		
		
		cnt = 11;
		do {
			cnt++; // 일단 실행 하고 본다.
		} while (cnt<10); //조건을 본다 ( 반복 요부를 결정 )
		System.out.println("do whlie cnt : "+cnt);

		
//		조건이 만족되지 못하는 상황으로 시작할때는 두 구문이 다르게 반응 한다,
		
	}

}
