package Chapter01;

public class MinMax {

	public static void main(String[] args) {
		// 최대값 최소값 보기
		
		System.out.println("Byte : "+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
		
		System.out.println("Short : "+Short.MIN_VALUE+" - "+Short.MAX_VALUE);
		
		System.out.println("int : "+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);
		
		System.out.println("Long : "+Long.MIN_VALUE+" - "+Long.MAX_VALUE);
		
		System.out.println("Float : "+Float.MIN_VALUE+" - "+Float.MAX_VALUE);

		System.out.println("Double : "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
		
		
		/*
		 * Byte : -128 - 127
			Short : -32768 - 32767
			int : -2147483648 - 2147483647
			Long : -9223372036854775808 - 9223372036854775807
			Float : 1.4E-45 - 3.4028235E38
			Double : 4.9E-324 - 1.7976931348623157E308
			가 나온다
			
			#E = 10ⁿ 이다.
		 * */

	}

}
