package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * 주석 = 메모
		 * 
		 * Scanner
		 * 이름: 김00					next() 		 name
		 * 나이: 29						nextint() 	 age
		 * 주소: 부산 동래구 사직동		nextLine()	 address
		 * 연락처: 010-0011-1234		next    	 phone
		 * 
		 * 사용자의 이름은 김00이고 나이는 29살입니다.
		 * 주소는 부산 동래구 사직동에 거주중입니다.
		 * 연락처는 010-0011-1234
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine(); //nextLine 버퍼
		
		System.out.print("주소: ");
		address = scanner.nextLine(); //버퍼 적용
		
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + 
				"이고 나이는 " + age + "살입니다" );
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone);
		
		
		
		
		

	}

}
