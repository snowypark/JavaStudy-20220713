package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		
		// key , value
		// 컬렉션, 인터페이스 상속X
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		
		//Map.put 으로 값 추가
		strMap.put(1, "java");
		strMap.put(1, "java2");
		strMap.put(1, "java3");
		strMap.put(1, "java4");
		strMap.put(2, "java4");
		strMap.put(3, "java4");
		strMap.put(4, "java4");
		
		// key 값 중복 X
		System.out.println(strMap);
		
		// value 중복 O
		strMap2.put("A", "python");
		strMap2.put("B", "python");
		strMap2.put("C", "python");
		strMap2.put("D", "python");
		
		System.out.println(strMap2);
		
		// for-each 반복 불가능
		// iterator 사용
		
		// Index (X) -> key value
		strMap.get(10);
		
		//keySet = return
		Iterator<Integer> irKey = strMap.keySet().iterator();
		
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
		
		strMap.entrySet().forEach(arg -> {
			System.out.println(arg);
			System.out.println(arg.getKey());
			System.out.println(arg.getValue());
		});

	 
		
	}

}
