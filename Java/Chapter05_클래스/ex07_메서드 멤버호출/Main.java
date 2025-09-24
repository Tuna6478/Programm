package Chapter05.ex07;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(); //객체화
		
//		객체화 후에 class에 있는 메서드, 변수 등,,, 전부 사용 할 수 있다.
		
//		시동 걸기 전에 기어 확인
		int gear = car.gear;
		System.out.println("현재 기어 : "+gear);
		
//		시동걸기
		car.start();
		
//		기어 변경
		car.Change(3);
		
//		- 매서드 맴버호출 - 

	}

}
