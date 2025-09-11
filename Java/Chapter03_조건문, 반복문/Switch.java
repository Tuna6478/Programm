package Chapter03;

public class Switch {

	public static void main(String[] args) {
	
//		빠르게 대응 해야될때 주로 쓰인다.

//		하지만 switch는 if 처럼 조건을 다루지 않는 한계가 있다.
		
//		우리가 가지고 있는 음료수 : 콜라, 생수, 오렌지주스, 사이다, 에너지음료, 냉커피, 식혜
		
		String item = "오렌지주스";
		
//		JDK 1.6 이하에서는 switch 문에 숫자, 문자만 사용이 가능하다.
		switch (item) { // 모든 구문은 코드블록을 시작부터 끝까지 읽게 되어있다.
		case "콜라": // case 문에서 특정  case 위치로 이동시켜 주지만 코드블럭 끝까지 가야만 한다.
			System.out.println(item+"가 나왔습니다.");
			break; //그래서 특정 케이스 실행 이후에 break 를 통해 해당 코드블록을 빠져나오는 것이다.
			
		case "생수": //case 마다 특정 내용을 실행 한다.
			System.out.println(item+"가 나왔습니다.");
			break;
			
		case "오렌지주스": 
			System.out.println(item+"가 나왔습니다.");
			break;

		default: //마지막 까지 원하는 값이 없으면 실행
			System.out.println(item+"은 보유하지 않고 있습니다.");
			break;
		}
		
//		switch 작동 원리
//		switch (값)  case 너야? 아니야! 패스 -> 너? 패스 ->  같네! 너 출력해
		
	}

}
