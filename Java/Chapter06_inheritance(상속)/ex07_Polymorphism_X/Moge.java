package Chapter06_inheritance.ex07_Polymorphism_X;

public class Moge {

	public static void main(String[] args) {
		
//		다형성을 사용하지 않으면 하나하나 객체화를 한 다음 출력을 해야한다.
		
		Fire fire = new Fire();
		System.out.println(fire.cast());
		
		Ice ice = new Ice();
		System.out.println(ice.cast());
		
		Light light = new Light();
		System.out.println(light.cast());
		
		
		
	}

}
