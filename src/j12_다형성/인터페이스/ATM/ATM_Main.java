package j12_다형성.인터페이스.ATM;

import java.util.Scanner;



public class ATM_Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		
		Accountconnection accountconnection = null;
		
		
		
		System.out.println("[ATM 연결]");
		System.out.println("1. 계좌 선택");
		System.out.println("2. 잔액 확인");
		System.out.println("선택 >> ");
		
		
		select = scanner.nextLine(); // 번호 입력
		
		if(select.equals("1")) {
			System.out.println("계좌에 연결합니다.");
			
			
		}else if(select.equals("2")) {
			System.out.println("잔액을 확인합니다.");
			
		}else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		

	}

}
