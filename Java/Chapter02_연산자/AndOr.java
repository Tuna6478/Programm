package Chapter02;

public class AndOr {

	public static void main(String[] args) {
		
		int va1 = 6;
		
//		AND - 둘다 만족해야 함
		if (va1>1 && va1<7) {
			System.out.println(va1+"은 1보다 크코 7보다는 작다");
		}
		
//		OR - 둘 중 하나만 만족해도 됨
		if (va1%2==0 || va1%4==0) {
			System.out.println("2 또는 3의 배수");
		}

	}

}
