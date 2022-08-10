package j17_컬렉션.user;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
		
		
					 // key ,  value
	public static Map<String, String> addUser() {
		// "username" , scanner 입력으로 key 값 저장
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, String> user = new HashMap<String, String>();
		
		System.out.print("아이디: ");
		user.put("username", scanner.nextLine());
		// String " " Key값
		
		System.out.print("비밀번호: ");
		user.put("password", scanner.nextLine());
		
		System.out.print("이름: ");
		user.put("name", scanner.nextLine());
		
		return user;
		// 저장된 값을 user로 반환 
	}	
			
	public static void main(String[] args) {
		
		Map<String, String> user = new HashMap<String, String>();
		
		// set in ( map<> )
		Set<Map<String, String>> userSet = new HashSet<Map<String, String>>();
		// set = 값을 저장 = 입력
		
		// addUser에 저장한 양식을 입력
			
		userSet.add(addUser());
		userSet.add(addUser());
		userSet.add(addUser());
		
		
		// 출력
		// get = 저장된 값을 가져옴
		userSet.forEach(map -> {
			System.out.println("아이디: " + map.get("username"));
			System.out.println("비밀번호: " + map.get("password"));
			System.out.println("이름: " + map.get("name"));
		});
		
		// key값 String으로 출력하기 때문에 "username"이 오타날 경우 null
		
		// Map = interface 기반
		// hashmap = map을 구현
	}

}
