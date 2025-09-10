package Chapter02;

public class One {

	public static void main(String[] args) {
		int x = 10;
		int y = 10; 
		
		x++; //나중에 증가
		++y; //먼저 증가
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x=1;
		y=1;
//		x가 먼저 증가 -> 2, 10을 더하면=12
		int resule1 = (++x)+10;
		
//		y와 10을 더해서 11, 이후 y는 1증가해서 2
		int resule2 = (y++)+10;
		
		System.out.println("resule1 = "+resule1);
		System.out.println("resule2 = "+resule2);
//		n++ (아령을 들고 나서 +1) -> 카운트에 주로 활용 (행동을 하고나서 +1)
//		++n (증가한 내용을 이용해 다른행동을 할 때)
		

//		반전연산 (! not) true -> false 변환 (반대로 가능)
		boolean yn = true;
		System.out.println("yn = "+yn); // 변환 X
		
		yn = !yn;
		System.out.println("!yn = "+yn); // 변환 O true -> false
		
		yn = !yn;
		System.out.println("!yn = "+yn); // 변환 O false -> true
	}

}
