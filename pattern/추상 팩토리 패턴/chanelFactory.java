package pattern;

//������ǰ�� �����ϴ� ���� Ŭ����
public class chanelFactory implements AbstractFactory{
	
	//���� ����
	public topProduct createTopProduct() {
		return new chanelTopProduct();
	}
	
	//���� ����
	public bottomProduct createBottomProduct() {
		return new chanelBottomProduct();
	}
}
