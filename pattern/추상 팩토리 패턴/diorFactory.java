package pattern;

//디올제품을 생산하는 공장 클래스
public class diorFactory implements AbstractFactory{
	
	//상의 생성
	public topProduct createTopProduct() {
		return new diorTopProduct();
	}
	
	//하의 생성
	public bottomProduct createBottomProduct() {
		return new diorBottomProduct();
	}
}
