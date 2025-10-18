package Chapter06_inheritance.ex08_Polymorphism_O;

public class Light extends Spell {

	@Override
	public String casting() {//부모의 기능을 일부만 사용하기
		return "빛 "+super.casting();
	}
	
	

}
