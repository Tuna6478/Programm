package Chapter02;

public class Three {

	public static void main(String[] args) {
		
//		3항연산자 = 조건이 true면 A, fales 면 B 값이 대입 된다.
		
		int score = 80;
//		char grade = score > 90 ? 'A' : 'B'; = 결과 : B
//		90 보다 크면 A
//		80 보다 크면 B 
//		아니면 C
//		condition ? var1 : var2 <- var2에 는 값 또는 다른 조건이 들어갈 수 있다.(3항연산자가 또 들어 갈 수 있다.)
		char grade = score > 90 ? 'A' : score > 80 ? 'B' : 'C';
		
		System.out.println(score+" 점은 등급 "+grade);
		

	}

}
