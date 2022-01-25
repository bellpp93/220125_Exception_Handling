package 예외처리예제;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try {
			int[] array = new int[4];  //정수형 배열은 자동으로 0으로 초기화됨.
			array[5] = 10;
		} catch (Exception e) {
			System.out.println("배열의 크기를 벗어났음!!" + e);
		}	
	}
}
