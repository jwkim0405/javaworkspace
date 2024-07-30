package test09_comparator;

// 사용자 정의 클래스가 정렬되기 위해서는 
// 비교 기준이 필요
// 1. Comparable 인터페이스 구현
//	-> 제네릭: 타입 매개변수에 비교하고자 하는 클래스 타입을 집어넣어준다.
public class Person implements Comparable<Person>{
	String name;
	int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		// 일반적으로 String은 같은 문자열에 대해서 같은 해시코드가 나온다.
		// => name의 해시코드만 사용해서 구별하자,
		return name.hashCode();
		}


	// 매개변수와 같으면 true. 아니면 false
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.age == p.age;
		}
		
		return false;
		
	}

	// add unimplemented methods...

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		// 나이를 기준으로 비교해보자.
		
		// 양수: 자리 바꿈
		// 음수: 자리 유지
		// 0: 동일 위치
//		return this.age - o.age;
		
		// 이름
		// String에 정의되어 있는 비교 메서드를 사용한다
//		return this.name.compareTo(o.name);
		
		// 1. 기본적으로는 나이 순으로, 나이가 같다면 이름 순으로!!
		if (this.age == o.age)
			return this.name.compareTo(o.name);
		return this.age - o.age; // * -1 해서 부호를 바꿔주면 역순이 됩니다~
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [name = " + name + " age= " + age + "]";
	}
}
