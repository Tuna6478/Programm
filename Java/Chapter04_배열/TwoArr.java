package Chapter04;

public class TwoArr {

	public static void main(String[] args) { // 			04

//		arr 아파트 2개층, 3개 호를 가지고 있다.
		
//		int[] arr, int arr[]  기능적으로 완전히 동일하다. - 표기 방식에서 차이가 있다.
		
//		int[][] arr = {{00,01,02,03},{10,11,12,13}}; <- 한눈에 안들어온다.
		
		int[][] arr = { //다차원은 이렇게 적어야 보기가 편하다.
				{00,01,02,03},
				{10,11,12,13}
		};
		
//		royal 아파트는 4개층 4개호가 있다. 
		String[][] royal = new String[4][4];
		royal[0][0] ="0층 0호";
		
//		자동으로 값을 넣는 문
		for (int i = 0; i < royal.length; i++) { 
			for (int j = 0; j < royal[i].length; j++) { // 얘가 false가 나올때까지 함
				royal[i][j] = i+"층 "+j+"호 ";
				System.out.println(royal[i][j]);
			}
		}

		
		
	}

}
