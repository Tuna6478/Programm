package Chapter04;

public class ForEach {

	public static void main(String[] args) {
		
		int[] socre = {10,20,30,40,50};
		
//		일반 for
		for (int i = 0; i < socre.length; i++) {
			System.out.println(i+" : "+socre[i]);
		}
		
		System.out.println("-------------");

//		향상된 for
		for (int i : socre) {
			System.out.println(i);
		}
	}

}
