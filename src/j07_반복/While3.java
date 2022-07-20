package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		
		/*
		 * 반복횟수 입력:
		 * 
		 * n 변수에 저장
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4 ...
		 */
		
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int i = 0;
		
		System.out.print("반복횟수 입력: ");
		n = scanner.nextInt();
		
		
		while(i < n) {
			System.out.println("i = " + (i +1));
			i++;
		}
		
		System.out.println();
		
		
		i = 0;
		while(i < n) {
			System.out.println("i = " + (n - i));
			i++;			
		}
		

	}

}
