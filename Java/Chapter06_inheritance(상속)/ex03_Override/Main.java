package Chapter06_inheritance.ex03_Override;

public class Main {

	public static void main(String[] args) {
		
		MyCar car = new MyCar();
		car.start(); 
		car.turbo = true;
		int spead = car.run();
		System.out.println("차가 시속"+spead+"km 으로 달린다.");
		car.stop();
	}

}
