package Chapter06_inheritance.ex04;

//상속 받은 클래스 (1개의 자바 파일에 1개 이상의 클래스가 가능) = 권고사항 1개의 파일에 1개의 클래스
public class Chlid extends ParntHouse {

	@Override
	public void useRoom() {
		System.out.println("첫째가 방을 사용 한다.");
	}

}

//	The public type ChlidOne must be defined in its own file
//	자바파일에는 해당 자바파일과 이름이 동일한 클새스 하나만 public을 가져 갈 수 있다.
class ChlidOne extends ParntHouse {
	@Override
	public void useRoom() {
		System.out.println("둘째가 방을 사용 한다.");
	}
}

class ChlidTwo extends ParntHouse {
	@Override
	public void useRoom() {
		System.out.println("셋째가 방을 사용 한다.");
	}
}

class ChlidThree extends ParntHouse {
	@Override
	public void useRoom() {
		System.out.println("넷째가 방을 사용 한다.");
	}
}

class ChlidFour extends ParntHouse {

	@Override
	public void useRoom() {
		System.out.println("다섯째가 방을 사용 한다.");

	}
}