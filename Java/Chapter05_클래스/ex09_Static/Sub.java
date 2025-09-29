package Chapter05.ex09_Static;

public class Sub {
	
//	static 원본이 자리 잡은 곳
//	static 은 인스턴스가 불가능 하다.
	static int sField = 134;
	int field = 1;
	
	static int plus(int a, int b) {
		return a+b;
	}
	
	static int minu(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) { //객체화 가능 
		return a*b; 
	}

}
