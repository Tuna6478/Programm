package Chapter05.ex10_final;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("KOREA", "홍길동");
		p.age = 30;
		
//		p.ssn = "h"; // The final field Person.ssn cannot be assigned : 
//		Person.ssn = "a";
//		final 키워드가 붙은 필드는 초기값을 읽을 수만 있다.
//		p.nation = "name";		The final field Person.nation cannot be assigned : 필드 Person.nation을 할당할 수 없다.
//		p.name = "KIM"; 		The final field Person.nation cannot be assigned : 필드 Person.nation을 할당할 수 없다.
		
		System.out.println(p.nation);
		System.out.println(p.name);
		System.out.println(Person.ssn);
		System.out.println(p.age);

	}

}
