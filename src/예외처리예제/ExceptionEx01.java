package ����ó������;

public class ExceptionEx01 {

	public static void ExceptionExample() throws Exception {
		int number = 50/0;
	}
	
	public static void main(String[] args) {
		//try ���
		try {  //���ܰ� �߻��� ���ɼ��� �ִ� ���๮
			ExceptionExample();
		//catch ���
		} catch (Exception e) {  //(ó���� ���� Ÿ�� ����) ���� ó����
			System.out.println("ERROR �߻�" + e);
		}
	}
}
