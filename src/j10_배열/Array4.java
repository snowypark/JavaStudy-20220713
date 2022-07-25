package j10_배열;

public class Array4 {

	public static void main(String[] args) {

		//문자열길이 = 메소드(.length)를 통해 반환	
		String name = "";
		name.length();
		
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

							//배열의 크기
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
