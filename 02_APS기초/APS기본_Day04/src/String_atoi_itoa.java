
public class String_atoi_itoa {
	public static void main(String[] args) {
//		String strNum = "1234";
//		
//		System.out.println(0 + strNum);	// 01234, 문자열
//		
//		int num = Integer.parseInt(strNum);
//		
//		System.out.println(0+num);	// 1234, 숫자
		
		// 문자열 -> 정수
//		System.out.println(atoi("1324"));

		// 정수 -> 문자열
		int intVar = 324;
		String intStr = String.valueOf(intVar);
		System.out.println(intStr);
	}
	
	static int atoi(String str) {
		int N = str.length();
		int num = 0;
		for (int i = 0; i < N; i++) {
			char c = str.charAt(i);
			if ('0' <= c && c <= '9')
				num = (num * 10) + (c - '0');
		}
		return num;
	}
}
