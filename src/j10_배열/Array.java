package j10_배열;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
				
		/*
		 * 배열 선언과 초기화
		 */

		// 정수 배열
		int[] numbers = new int[5];

		// 문자열 배열
		String[] strArray = new String[5];

		// 객체 배열
		Scanner[] scanArray = new Scanner[5];
		
		Scanner s = new Scanner(System.in);
		
		
		/*
		 * 배열에 값 추가
		 * null = 비었다.
		 * 배열 생성 직후 null  = 값이 할당되지 않음
		 */
		
		numbers[0] = 10;
		numbers[1] = 20;
		
		strArray[4] = "문자열";
		
		scanArray[0] = new Scanner(System.in);
		System.out.println(scanArray[0]);
		
		System.out.println(numbers[0]);
		System.out.println(strArray[4]);
		
		

	}

}
