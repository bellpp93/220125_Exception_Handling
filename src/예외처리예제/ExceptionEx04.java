package ����ó������;

public class ExceptionEx04 {

	public static void main(String[] args) {
		try {
			String[] str = {"10"," 20","30"};
			
			int data = Integer.parseInt(str[1]);  //�⺻ ������ Ÿ���� ��üȭ
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
