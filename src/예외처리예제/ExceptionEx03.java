package ����ó������;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try {
			int[] array = new int[4];  //������ �迭�� �ڵ����� 0���� �ʱ�ȭ��.
			array[5] = 10;
		} catch (Exception e) {
			System.out.println("�迭�� ũ�⸦ �����!!" + e);
		}	
	}
}
