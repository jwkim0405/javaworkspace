package test07_sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
	public static void main(String[] args) {
		// 순서를 가지는 Collection들만 정렬 가능
		// Collections의 sort()를 이용한 정렬
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("A", 5));
		persons.add(new Person("C", 2));
		persons.add(new Person("F", 3));
		persons.add(new Person("B", 2));

		System.out.println(persons);
		// 사용자 정의클래스를 사용한 리스트는 기본적으로 정렬할 수 없음.
		// Comparable 인터페이스 구현 or Comparator 클래스를 정의
		// - 비교 기준이 없으므로 사용자 정의 클래스에 비교 기준을 만들어준다.
		
//		Collections.sort(persons);
		
		System.out.println(persons);
		
		// 만약 숫자의 리스트였다면 숫자 오름차순으로 정렬
		
	}
}
