package pattern;

//샤넬제품을 생성하는 공장 클래스
public class chanelFactory implements AbstractFactory{
	
	//상의 생성
	public topProduct createTopProduct() {
		return new chanelTopProduct();
	}
	
	//하의 생성
	public bottomProduct createBottomProduct() {
		return new chanelBottomProduct();
	}
}
