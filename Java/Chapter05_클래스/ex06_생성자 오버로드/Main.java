package Chapter05.ex06;

public class Main {

	public static void main(String[] args) {
		
//		Puppy 가 생성 될때 이름과 할일을 지정
		Puppy puppy = new Puppy("멍멍이","집지키기");
		System.out.println(puppy.name); // puppy 에 있는 변수의 값 꺼내 옴
		System.out.println(puppy.goal);
		
		Puppy p1 = new Puppy();
		Puppy p2 = new Puppy("강이지");
	}
	
//	 - overload - 

}
