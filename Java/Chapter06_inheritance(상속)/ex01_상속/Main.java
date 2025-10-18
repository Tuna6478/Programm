package Chapter06_inheritance.ex01;

public class Main {

	public static void main(String[] args) {
		
//		Maml 의 기능 사용하기 - birth(), eat()
		Mamal mal = new Mamal();
		mal.birth();
		mal.eat();
		
//		person - useTool(), social(), talk()
		Person p = new Person();
		p.useTool();
		p.social();
		p.talk();
		
//		상속에서 내것처럼 쓴다 = 나를 객체화 하면 부모것도 쓸 수 있다
		p.birth();
		p.eat();
		

	}

}
