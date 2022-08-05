package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {

	public static void main(String[] args) {
		
		
		Map<String, Object> mappage = new HashMap<String, Object>();
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "bulbasaur");
		map1.put("url", "https://pokeapi.co/api/v2/pokemon/1/");
		
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "ivysaur");
		map2.put("url", "https://pokeapi.co/api/v2/pokemon/2/");
		
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("name", "venusaur");
		map3.put("url", "https://pokeapi.co/api/v2/pokemon/3/");
		
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		
		mappage.put("count", 1118);
		mappage.put("next", "https://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		mappage.put("previous", null);
		mappage.put("result", list);
		
		System.out.println(mappage);

	}
	
	/*
	 * 빌드 툴
	 * 메이븐 : 그레이들보다 먼저 나와서 많이 사용됨.
	 * 그레이들 : 메이븐 다음으로 출시. 버전 업이 자주 됨
	 */

}
