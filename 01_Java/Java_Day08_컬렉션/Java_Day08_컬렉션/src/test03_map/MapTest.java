package test03_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		// Map
		// - 사전과 같은 자료구조
		// - 키 & 값의 쌍으로 구성되어 있음
		// - 키는 구별이 되어야 함(중복허용하지 않음, 순서도 없음)
		// - 값은 중복될 수 있다.
		
		// Map<키자료형, 값자료형> map = new HashMap<>();
		
		Map<String, String> map = new HashMap<>();
		
		map.put("luna", "cat");
		map.put("luna", "dog");
		map.put("max", "dog");
		
		System.out.println(map);
		
		// Key가 있는지 확인
		System.out.println(map.containsKey("max"));
		
		// Value가 있는지 확인
		System.out.println(map.containsValue("cat"));
		
		// 맵의 순회
		// 1. KeySet();
		for (String key : map.keySet())
			System.out.printf("%s : %s \n", key, map.get(key));
		
		// 2. entrSet(); => Entry : 키 -값의 쌍
		for(Map.Entry<String, String> entry : map.entrySet())
			System.out.printf("%s : %s \n", entry.getKey(), entry.getValue());
		
		
	}
}
