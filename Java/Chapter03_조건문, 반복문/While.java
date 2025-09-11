package Chapter03;

public class While {

	public static void main(String[] args) {
		
//		조건이 참이면 계속 한다 -> 조건이 거짓일떄 까지 한다.
//		횟수가 정해지지 않은 경우 유용
		
//		while 은 조건이 참이면 계속 반복한다.
		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
			if (i==100) {
				break; //머출수 있는 코드로 변함 (break는 소스파일 전채를 멈추는게 아니라 가장 가까운 곳에 있는 반복문을 즉시 종료시킨다.)
			}
		}
		
//		unreahable code(언리치어드 코드) : 현재 이 상황 대로라면 여기 까지 닿지 않는다.
//		해결 방법1 : 에러코드를 지워준다
//		해결 방법2 : while 문이 멈출 수 있는 방법을 마련해 준다.
		
		int cup = 1;
		System.out.println(cup);
		
	}

}
