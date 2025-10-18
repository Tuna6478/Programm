package Chapter06_inheritance.ex08_Polymorphism_O;

public class Moge {

	public static void main(String[] args) {
		
		Spell sp;
//		변수를 여러개 선언하지 않고 1개의 변수에 여러개의 객체를 담아서 쓸 수 있다.
		sp = new Fire();
//		sp.casting();
		System.out.println(sp.casting());  // 왜? 반환 값이 출력문으로 되있지 않기 때문
		
		sp = new Ice();
		System.out.println(sp.casting());
		
		sp = new Light();
		System.out.println(sp.casting());

	}

}
