package Chapter06_inheritance.ex08_Polymorphism_O;

public class ArrMage {

	public static void main(String[] args) {
		
//		Ice, Light, Fire 주문을 연속으로 날릴수 있도록 배열과, for 문을 활용해서 구형 해 보자
		
		/*
		 * 문제
		 * 어떻게 저 클래스를 연속으로 출력 할건지
		 * 2. 저 내용을 어떻게 배열로 넣을건지
		 * 3. 출력을 어떻게 할 건지
		 */
		
		
//		배열 기본 사용 법
		int[] a = new int[3];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//		방법 1
		Spell spell;
		String[] sp = new String[3];
		spell = new Fire();
		sp[0] = spell.casting();
		
		spell = new Ice();
		sp[1] = spell.casting();
		
		spell = new Light();
		sp[2] = spell.casting();
		
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		System.out.println("---------------------------");
		
//		방법 2
//		인스턴스에 배열을 바로 선언 하는 것
		Spell[] arr = new Spell[3];
		arr[0] = new Ice();
		arr[1] = new Fire();
		arr[2] = new Light();
		
		for (Spell spell2 : arr) {
			System.out.println(spell2.casting());
		}

	}

}
