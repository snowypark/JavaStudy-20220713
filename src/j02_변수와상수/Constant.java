package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUMBER;
		MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		//상수 변수명은 대문자, _ 사용
		
		int number = 10;
		number = 80;
		
		//MAX_NUMBER = 200;
		//상수는 값 변화 불가능
		
		System.out.println("최소값: " + MAX_NUMBER);
		System.out.println("최대값: " + MIN_NUMBER);
		System.out.println("현재값: " + number);

	}

}
