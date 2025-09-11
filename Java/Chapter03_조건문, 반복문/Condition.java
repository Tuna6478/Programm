package Chapter03;

public class Condition {

	public static void main(String[] args) {
		
//		조건문 (만약)
		
		if (true) {
			System.out.println("조건이 참 일경우만 실행 한다.");
		}
		
		if (false) { // Dead code 경고
			System.out.println("무조건 실행 되지 않는다.");
		}
		
		boolean a = true;
		boolean b = false;
		
		if (a) {
			System.out.println("a 는 true 이므로 실행 된다.");
		}
		
		if (b) {
			System.out.println("b 는false 이므로 실행 되지 않는다.");
		}

	}

}
