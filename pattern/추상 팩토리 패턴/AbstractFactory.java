package pattern;

//�ֻ��� ���� Ŭ����
//����,���Ǹ� �����ϴ� ���� �޼ҵ带 �߻�ȭ
public interface AbstractFactory {
	topProduct createTopProduct();  //���� �߻� �޼���
	bottomProduct createBottomProduct(); //���� ���� �߻� �޼���
}
