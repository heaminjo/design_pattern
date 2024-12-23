package pattern;

public class Client {

	public static void main(String[] args) {
		//샤넬 상의를 생성하고싶다.
		//샤넬 공장 가동
		AbstractFactory factoryC = new chanelFactory();
		//샤넬 상의 생성
		topProduct top= factoryC.createTopProduct();
		
		//디올 하의를 가지고싶다.
		//디올 공장 가동
		AbstractFactory factoryD = new diorFactory();
		//디올 하의 생성
		bottomProduct bottom = factoryC.createBottomProduct();
	}

}
