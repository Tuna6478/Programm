package Chapter06_inheritance.ex01;

public class Person extends Mamal { //extends = 상속 받을 class (이중 상속은 불가능 하다.)
//	상속을 하고 다른 곳에서 인스턴스 하면 상속한 내용을 자기 것 처럼 사용할 수 있다.
	
	public void useTool() {
		System.out.println("도구를 사용 하다.");
	}
	
	public void social() {
		System.out.println("사회 생활을 하다.");
	}

	public void talk() {
		System.out.println("대화 하다.");
	}
}
