package pattern;

//�����ǰ�� �����ϴ� ���� Ŭ����
public class diorFactory implements AbstractFactory{
	
	//���� ����
	public topProduct createTopProduct() {
		return new diorTopProduct();
	}
	
	//���� ����
	public bottomProduct createBottomProduct() {
		return new diorBottomProduct();
	}
}
