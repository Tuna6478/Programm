package Chapter05.ex03;

public class Main {

	public static void main(String[] args) {
		
//		std1 과 std2는 각각 다른 복사본 이다.
		Student std1 = new Student(); // new 객체화 원본에 Class를 복사 해오는 것 (new Student(); <- Studnet 를 참조해서 객체화
		Student std2 = new Student(); // new 는 복사하고 붙여넣기
		
//		같은 클래스를 복사하더라도 서로 다른 일련번호를 가지고 있다.
//		일련번호를 보면 서로 다르다 (내용은 같을 지라도..)
		System.out.println(std1);
		System.out.println(std2);
		
//		그래서 String 끼리 == 대조한다면 일련번호를 대조하기 때문에 다르다고 판단 할수있다.
//		그래서 equals()를 통해 일련번호가 아닌 내용으로 대조 하도록 해야 한다.
//		== - 기본형(int,flast....) 을 비교하는데 사용
//		.squals() - 참조형(String,객체..) 문자열이나 객체의 실체 값(내용)을 비교하는데 사용
		
//		- 객체화 - 
		
	}

}
