package ����ó������;

public class ExceptionEx05 {

	static String str;  //Ŭ���� ����

	public static void main(String[] args) {
		if(str != null) {  //null�� �ƴ� ���
			String newStr = str.toUpperCase();  //�빮�ڷ� ��ȯ���Ѷ�
			System.out.println(newStr);
		} else {  //null�� ���
			System.out.println("String is null");
		}
	}
}
