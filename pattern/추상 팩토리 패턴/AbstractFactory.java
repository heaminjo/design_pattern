package pattern;

//최상위 공장 클래스
//상의,하의를 생성하는 여러 메소드를 추상화
public interface AbstractFactory {
	topProduct createTopProduct();  //상의 추상 메서드
	bottomProduct createBottomProduct(); //하의 생성 추상 메서드
}
