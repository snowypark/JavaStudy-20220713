package j05_입력;

import java.util.Scanner;
//import 자동입력 Ctrl+Shift+O

public class Input1 {

	public static void main(String[] args) {
		
		//클래스  변수명
		Scanner scanner = new Scanner(System.in);
		
		String str = null;
		String str2 = null;
		int num1 = 0;
		
		System.out.print("내용을 입력하세요: ");
		
		str = scanner.nextLine(); //문자열 입력. 띄어쓰기 포함	
		System.out.print("내용을 입력하세요: ");		
		str2 = scanner.next(); //띄어쓰기 미포함
		System.out.print("내용을 입력하세요: ");
		num1 = scanner.nextInt(); 
		
		System.out.println("출력: " + str);
		System.out.println("출력: " + str2);
		System.out.println("출력: " + num1);
	}

}
