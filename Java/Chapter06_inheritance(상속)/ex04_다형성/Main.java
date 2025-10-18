package Chapter06_inheritance.ex04;

public class Main {

	public static void main(String[] args) {
//		다형성을 사용하기 전
//		사용할 개체가 여러개 라면 여러개의 객체를 담을 변수를 선언해 줘야 한다.
//		만약 사용할 객체의 갯수가 100개라면, 100개의 변수를 선언해야 한다.
		
//		이들에 공통점은 같은 부모를 상속을 받은 것
		
		Chlid ch = new Chlid();
		ch.useRoom();
		
		ChlidOne ch1 = new ChlidOne();
		ch1.useRoom();
		
		ChlidTwo ch2 = new ChlidTwo();
		ch2.useRoom();
		
		ChlidThree ch3 = new ChlidThree();
		ch3.useRoom();
		
		ChlidFour ch4 = new ChlidFour();
		ch4.useRoom();
		
//		다형성을 사용한 후
//		하나의 변수(부모타입)에 여러 객체(자식타입)을 수용할 수 있다.
		
		ParntHouse house;
		
		house = new Chlid();
		house.useRoom();
		
		house = new ChlidOne();
		house.useRoom(); 
		
		house =new ChlidTwo();
		house.useRoom();
		
		house = new ChlidThree();
		house.useRoom();
		
		house = new ChlidFour();
		house.useRoom();
		
		
		 
	}

}
