package Chapter03;

public class Continue {

	public static void main(String[] args) {

//		0에서 10까지 출력
//		3은 캔슬
		
		for (int i = 1; i <=10 ; i++) {
			if (i==3) {
				continue; // 이 블력을 무시 해라
			}
			System.out.println(i);
		}
		

	}

}
