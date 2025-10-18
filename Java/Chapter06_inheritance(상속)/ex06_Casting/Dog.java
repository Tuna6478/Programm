package Chapter06_inheritance.ex06_Casting;

public class Dog extends Mammal {
	
	@Override
	public void birth() { // 같은 포유류하 하더라도 새끼를 낳는 수는 각각 다르다.
		System.out.println("새끼를 5마리 낳는다.");
	}

	public void bark() { // Mammal 이 아닌 Dog의 고유 특성(메서드)
		System.out.println("멍멍 짖는다");
	}
	
}
