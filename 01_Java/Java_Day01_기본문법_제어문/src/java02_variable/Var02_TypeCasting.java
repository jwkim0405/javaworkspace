package java02_variable;

public class Var02_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 : 자료형을 바꾸는 것
    	
    	// 1. 묵시적 형 변환
    	// 	- 범위가 작은 자료형 -> 범위가 큰 자료형으로 이사
//    	int n1 = 100;
//    	long n2 = n1;
//    	float f1 = n1;
    	
//    	System.out.printf("%d\n", n2);
//    	
    	// 2. 명시적 형 변환
    	//	- 범위가 큰 자료형 -> 범위가 작은 자료형으로 이사
    	//	- 기본적으로 에러가 남. 안됨.
    	//	- 프로그래머가 명시적으로 바꿔줘야 함.
    	//	- 형 변환 연산자 사용 : (바꾸고싶은 자료형)
//    	long n3 = 100L;	// 여기서도 묵시적 형 변환이 일어나고 있었음.
//    	int n4 = (int) n3;
//    	System.out.printf("%d\n", n4);
    	
    	// 리터럴
    	// - 값을 소스코드 상에 적어놓은 것
    	// - 데이터형에 따라서 값의 표기 방법이 다르다.
    	// - 100 => int형의 숫자 100;
    	// - 100L => long형의 숫자 100
    	// - 12.321 => double형
    	// - 12.321f => float형
    	// - "Hello, World!" => String형의 문자열.
    	
    	int n5 = (int) 12345678901234L;
    	long n6 = 12345678901234L;
    	
    	System.out.println(n5);
    	
        
        
    }
}
