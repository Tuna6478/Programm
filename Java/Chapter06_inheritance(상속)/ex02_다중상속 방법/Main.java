package Chapter06_inheritance.ex02;

public class Main {

	public static void main(String[] args) {
		
//		상속 X
//		사용하고 싶은 메서드가 각각 클래스에서 훝어져 있으므로 각각 객체화 해서 불러내야 한다.
		int result = 0;
		
		Operator op = new Operator();
		result = op.plus( 10, 5);
		System.out.println(result);
		
		Operator2 op2 = new Operator2();
		result = op2.minus(10, 5);
		System.out.println(result);
		
		Operator3 op3 = new Operator3();
		result = op3.multi(10, 5);
		System.out.println(result);
		
		Operator4 op4 = new Operator4();
		result = op4.devide(10,5);
		System.out.println(result);
		
		
//		상속 O
//		4측 연산을 하자고 인스턴스를 4개를 선언 하는 것도 귀찮고, 각 클래스에 어떤 메서드가 있는지 확인하기 힘들다.
//		그래서 하나의 클래스에 몰아넣으면 해결된다.
//		사용자 입장에서는 Operator 클래스만 기억하면 되니까 편하다.
//		상속에 상속에 상속에... 상속을 해주면 상속을 한 최상위 객체까지( 모든 객체를 ) 쓸 수 있다.
		result = op.plus(10, 5);
		result = op.minus(10, 5);
		result = op.multi(10, 5);
		result = op.devide(10, 5);
		
	}

}
