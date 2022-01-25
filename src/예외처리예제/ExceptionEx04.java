package 예외처리예제;

public class ExceptionEx04 {

	public static void main(String[] args) {
		try {
			String[] str = {"10"," 20","30"};
			
			int data = Integer.parseInt(str[1]);  //기본 데이터 타입을 객체화
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
