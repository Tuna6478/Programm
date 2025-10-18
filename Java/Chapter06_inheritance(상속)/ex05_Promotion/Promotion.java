package Chapter06_inheritance.ex05_Promotion;

public class Promotion {

	public static void main(String[] args) {
		
		Vertvrate 척추동물;
//		닭, 오리, 개, 고양이는 모두 척추 동물 이르로 이 안에 들어 갈 수 있다.
		척추동물 = new Dog();
		척추동물 = new Cat();
		척추동물 = new Duck();
		척추동물 = new Chiken();
		
//		고양이는 조류에 속하함?
//		Type mismatch: cannot convert from Cat to Birds
//		Birds birds = new Cat();
		
//		닭은 포유류에 속하나?
//		Mammal mal = new Chiken();

	}

}

class Vertvrate{}

class Mammal extends Vertvrate{}
class Birds extends Vertvrate{}

class Dog extends Mammal{}
class Cat extends Mammal{}

class Duck extends Birds{}
class Chiken extends Birds{}
