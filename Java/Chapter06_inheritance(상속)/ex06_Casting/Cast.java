package Chapter06_inheritance.ex06_Casting;

public class Cast {

	public static void main(String[] args) {

//		promotion
		
//		Mammal ma;
//		ma = new Dog();
//		ma.birth();
		
		Mammal mal;
//		다형성에 의해서 Dog 과 Cat은 부모 형태인 Mammal 안으로 들어갈 수 있다.
		mal = new Dog(); 
		mal.birth(); 			//  Dog에서 오버라이드한 데이터를 가져온다.
		mal.eat();				// 상속 받은 메서드라 사용 가능
//		mal.bakr();			// 내 고유의 매서드는 사용 못함
		
//		Type mismatch: cannot convert from Mammal to Dog
//		Dog dog = mal;
		
//		명시적 형변환
		Dog dog = (Dog)mal; //부모 형채에서 자식 형태로 되돌아 올려면 Casting을 하면 된다.
//		Cat cat = (Cat)mal;	 //되돌아 갈때는 원해 형태를 잘 기억해서 돌아가야한다( 아니면 오류난다.)  	
		
		
		dog.bark();

	}

}
