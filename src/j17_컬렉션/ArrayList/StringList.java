package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import org.w3c.dom.html.HTMLTableRowElement;

public class StringList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		// 값 추가
		list.add("Java");
		//추가될 값		
		list.add("python");
		list.add("C");
		list.add("html");

		// 리스트의 크기
		System.out.println("list 크기: " + list.size());
		
		
		//리스트 toString()
		System.out.println(list);
		

		//원하는 위치에 값 추가
		list.add(0, "CSS");
		System.out.println("list 크기: " + list.size()); //결과
		
		
		// 리스트에서 해당 인덱스 값 찾기
		String subject =  list.get(0);
		String subject2 =  list.get(1);
		String subject3 =  list.get(2);
		System.out.println("0번 인덱스의 값: " + subject);
		System.out.println("1번 인덱스의 값: " + subject2);
		System.out.println("2번 인덱스의 값: " + subject3);
		
		
		//리스트에서 인덱스 찾는 방법
		int findIndex = list.indexOf("Python");
		System.out.println("python이 있는 위치: " + findIndex);
		
		
		//해당 인덱스 위치의 값을 수정
		list.set(3,"C++");  // C -> C++
		System.out.println(list);
		
		
		//해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		
		tempList.add("phthon");
		tempList.add("C++");
		tempList.add("spring");
		
		boolean contain = list.contains("java");
		boolean containAll = list.containsAll(tempList);
		
		System.out.println("contains: " + contain);
		System.out.println("containsAll: " + containAll);
		
		
		// 다른 컬렉션의 데이터를 모두 추가
		list.addAll(tempList);
		System.out.println(list + "\n");
		
		
		//데이터 삭제
		list.remove("python");  // 앞쪽에 있는 python 삭제
		System.out.println(list + "\n");
		list.remove(5);
		System.out.println(list);
		
//		list.removeAll(tempList);
		System.out.println(list);
		

		// 해당 컬렉션을 포함하는 것을 제외하고 다 지움
		list.retainAll(tempList); 
		System.out.println(list);
		
		//리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		
		tempList.clear(); // 비우기
		System.out.println(tempList.isEmpty());
		
		
		List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"});
		System.out.println(asList);
		list.addAll(asList);
		System.out.println(list);
		
		System.out.println("------for------");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------foreach------");
		
		// foreach
		for(String str : list) {
			System.out.println(str);			
		}
		
		System.out.println("--------");
		
		
		String roles = "USER,ADMIN,TEST_USER";
		String[] roleArray = roles.split(",");
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
		Arrays.asList(roleArray).forEach(arg -> {
			System.out.println("role: " + arg);
		});
		
		
		
	}

}
