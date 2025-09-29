package Chapter05.ex08_Overload;

public class Main {

	public static void main(String[] args) {
		
		OverCalc calc = new OverCalc();
		
		String re = calc.plus("A", "B"); //컴파일러가 호출 시점에 매개변수 타입을 보고 알맞은 메서드를 자동으로 선택합니다.
		
		System.out.println(re);
		
		double d = calc.plus(3, 4.5);
		System.out.println(d);

	}

}
