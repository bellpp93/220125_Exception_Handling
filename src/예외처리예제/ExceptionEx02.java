package ����ó������;

public class ExceptionEx02 {

	public static void main(String[] args) {
		int a;
		int b;
		
		try {
			a = 0;
			b = 10 / a;
			System.out.println("�� ���������ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ����");
	}
}
