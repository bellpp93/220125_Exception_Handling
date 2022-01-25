package 예외처리예제;

public class ExceptionEx01 {

	public static void ExceptionExample() throws Exception {
		int number = 50/0;
	}
	
	public static void main(String[] args) {
		//try 블록
		try {  //예외가 발생할 가능성이 있는 실행문
			ExceptionExample();
		//catch 블록
		} catch (Exception e) {  //(처리할 예외 타입 선언) 예외 처리문
			System.out.println("ERROR 발생" + e);
		}
	}
}
