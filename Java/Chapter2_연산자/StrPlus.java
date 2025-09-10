package Chapter02;

public class StrPlus {

	public static void main(String[] args) {
		
		// 문자(" ",' ')가 발견되는 시점 부터는 터하기(Plus)가 아닌 추가 (add)가 된다. 
		// 피연산자가 모드 숫자일 경우 뎃셈 연산
		String str1 = "JDK"+8+0.65;
		System.out.println(str1);
		
		String str2 = 9+0.65+"JDK";
		System.out.println(str2);
		
		String str3 = ""+8+0.65+"JDK";
		System.out.println(str3);

	}

}
