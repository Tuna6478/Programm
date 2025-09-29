package Chapter05.ex08_Overload;

public class OverCalc {

	int plus(int a, int b) {
		return a+b;
	}
	
	String plus(String a, int b) {
		return a+b;
	}
	
	double plus(double a, int b) {
		return a+b;
	}  
	double plus(int a, double b) { // 접근 제어자가 없어서 같은 패키지에 있어야만 접근 가능
		return a+b;
	}
	
	public String plus(String a, String b) { // 접근 제어자가 있어서 아무 패키지에서 접근 가능
		return a+b;
	}
	
	
	
}
