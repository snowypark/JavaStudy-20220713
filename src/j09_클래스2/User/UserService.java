package j09_클래스2.User;

import java.util.Scanner;

public class UserService {

	private Scanner scanner;
	private User[] UserArray;

	public UserService(User[] UserArray) {
		this.scanner = new Scanner(System.in);
		this.UserArray = UserArray;
	}

	public boolean UserMainMenu() {

		String select = null;

		System.out.println("사용자 정보 시스템");
		System.out.println("1. 유저 등록");
		System.out.println("2. 유저 시스템 조회");
		System.out.println("q. 프로그램 종료");
		System.out.println("메뉴 선택>>");

		select = scanner.nextLine();
		if (select.equals("1")) {
			User user = addUser();
			if (user != null) {
				System.out.println(user.toString());
			}
		} else if (select.equals("2")) {
			ShowMenu();
		} else if (select.equals("q")) {

			System.out.println("프로그램 종료중 입니다.");
			return false;

		} else {
			System.out.println("잘못된 선택입니다.");
		}
		
		System.out.println();
		return true;

	}
	
	private void ShowMenu() {

		for(int i = 0; i <UserArray.length; i++) {			
			System.out.println("사용자 이름: " +UserArray[i].getUsername()
					+"\n이름: " + UserArray[i].getName());
		}
	}

	public User addUser() {

		for (int i = 0; i < UserArray.length; i++) {
			if (UserArray[i] != null) {
				continue;
			}
			UserArray[i] = inputUser();
			System.out.println("[ " + UserArray[i].getName() + " ] 유저 등록이 완료되었습니다.");
			return UserArray[i];
		}
		System.out.println("더 이상 유저를 등록할 수 없습니다.");
		return null;
	}

	private User inputUser() {

		String username = null;
		String password = null;
		String name = null;
		String email = null;

		System.out.println("[학생 등록]");

		System.out.print("사용자 이름 >> ");
		username = scanner.nextLine();

		System.out.print("비밀번호 >> ");
		password = scanner.nextLine();

		System.out.print("이름 >> ");
		name = scanner.nextLine();

		System.out.print("이메일 >> ");
		email = scanner.nextLine();

		return new User(username, password, name, email);
	}

}
