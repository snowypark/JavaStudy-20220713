package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Map 안에 리스트 안에 Map을 저장하는 구조를 배운다.
		 * 모든 객체는 object로 형변환 가능
		 */
				
					
		Map<String, Object> datamap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("todoCode", 182);
		map1.put("todo", "테스트_182");
		map1.put("improtance", false);
		map1.put("totalCount", 157);
		map1.put("incompleteCount", 78);
		map1.put("createDate", "2022-07-26");
		map1.put("updateDate", "2022-07-26");				

		Map<String, Object> map2 = new HashMap<String, Object>();
		
		map2.put("todoCode", 181);
		map2.put("todo", "테스트_182");
		map2.put("improtance", false);
		map2.put("totalCount", 157);
		map2.put("incompleteCount", 78);
		map2.put("createDate", "2022-07-26");
		map2.put("updateDate", "2022-07-26");
		
		list.add(map1);
		list.add(map2);
		

		datamap.put("code", 1);
		datamap.put("message ", "1page list success to load");
		datamap.put("data", list);
				
		
		System.out.println(datamap);
	}

}
