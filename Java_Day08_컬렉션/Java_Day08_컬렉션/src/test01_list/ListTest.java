package test01_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		// List
//		// 순서도 있고, 중복도 허용
//		
////		List<String> names = new ArrayList<String>();
		List<String> names = new ArrayList<>();
//		
//		names.add("Jeongwoo");
//		names.add("Sangin");
//		names.add("Hui");
//		
//		System.out.println(names);
//		
//		// 리스트가 비어있는지 체크
//		System.out.println(names.isEmpty());
//		
//		// 수정
//		// 2번째 index를 "hui"로 바꿈
//		names.set(2,  "hui");
//		System.out.println(names);
//		
//		// 조회
//		System.out.println(names.get(2));
//		
//		// 순회
//		for (String name : names)
//			System.out.println(name);
		
		// 삭제
//		names.remove(1);
//		System.out.println(names);
		
		// 값을 이용한 삭제
//		names.remove("sangin");
//		System.out.println(names);
		
		// 전부 삭제
//		names.clear();
//		System.out.println(names);
//		System.out.println(names.isEmpty());
		
		// 삭제를 할 때 주의할 점
		// - 중복된 값이 있을 때
		names.add("Jeongwoo");
		names.add("Hui");
		names.add("Hui");
		

		System.out.println(names);
		// max를 다 지우고 싶다.
		// => for문을 돌면서 순회를 하면서, 일치하는 애들은 전부 지워버린다.
		for (int i = names.size() - 1; i >= 0; i--)
			if(names.get(i).equals("Hui"))
				names.remove(i);	// 삭제하는 순간, 인데스가 변경되고 size도 변경됨. 더 이상 size가 변경되지 않음.
		System.out.println(names);
	}
}
