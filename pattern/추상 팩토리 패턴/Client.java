package pattern;

public class Client {

	public static void main(String[] args) {
		//���� ���Ǹ� �����ϰ�ʹ�.
		//���� ���� ����
		AbstractFactory factoryC = new chanelFactory();
		//���� ���� ����
		topProduct top= factoryC.createTopProduct();
		
		//��� ���Ǹ� ������ʹ�.
		//��� ���� ����
		AbstractFactory factoryD = new diorFactory();
		//��� ���� ����
		bottomProduct bottom = factoryC.createBottomProduct();
	}

}
