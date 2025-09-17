package Chapter04;

public class ThreeArr {

	public static void main(String[] args) { // 		05
		
//		royal 아파트는 4개층 4개호 방 3개
		String[][][] royal = new String[4][4][3];
		System.out.println(royal.length+" 호"); //열
		System.out.println(royal[0].length+" 층"); //행
		System.out.println(royal[0][0].length+" 개");
		
//		2층 3호 2번 방은 "철수의 방"
		royal[2][3][2] = "철수의 방";
//		0층 0호 0번 방은 "영희의 방"
		royal[0][0][0] = "영희의 방";
		
		System.out.println(royal[1][1][1]);

		//나머지는 "공실" 로 표기 하세요
		for (int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
				for (int j2 = 0; j2 < royal[i][j].length; j2++) {
//					System.out.println(royal[i][j][j2]);
//					if (!"철수의 방".equals(royal[i][j][j2]) && !"영희의 방".equals(royal[i][j][j2])) {
//						royal[i][j][j2] = "공실";
//					} -> 방법 1
					
					
					if (royal[i][j][j2] == null) {
						royal[i][j][j2] = "공실"; // 결과 값이 어떻게 나오는지 알고 있으면 이런 방식도 가능
					}
					
				}
			}
		}
		
		for (int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
				for (int j2 = 0; j2 < royal[i][j].length; j2++) {
					System.out.println(i+"층 "+j+"호 "+j2+"방 = "+royal[i][j][j2]);
				}
				
			}
		}
	}

}
