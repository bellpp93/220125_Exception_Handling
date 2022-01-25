package 예외처리예제;

public class ExceptionEx05 {

	static String str;  //클래스 변수

	public static void main(String[] args) {
		if(str != null) {  //null이 아닌 경우
			String newStr = str.toUpperCase();  //대문자로 변환시켜라
			System.out.println(newStr);
		} else {  //null인 경우
			System.out.println("String is null");
		}
	}
}
