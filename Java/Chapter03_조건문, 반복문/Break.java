package Chapter03;

public class Break {

	public static void main(String[] args) {
		
		
//		while 은 무한루프 중이다.
//		그런데 i 값이 100이 된다면 빠져나오도록 만들어 보자
		
		int i = 1;
		
		while (i <= 100) {
			System.out.println(i);
			if (i==100) {
				break;
			}
			i++;
		}

	}

}
