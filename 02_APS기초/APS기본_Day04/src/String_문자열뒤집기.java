import java.util.Arrays;

public class String_문자열뒤집기 {
	public static void main(String[] args) {
		
		// Java에서는 문자열 읽기는 가능, 특정 위치 문자 쓰기 X
		String str = new String("algorithm");
		
		char[] charArr = new char[str.length()];
		
//		for (int i = 0; i < str.length(); i++)
//			charArr[i] = str.charAt(i);
//		
//		System.out.println(Arrays.toString(charArr));
		
		// 1. 새로운 배열을 만들어서 뒤집기
		
//		char[] nextArr = new char[charArr.length];
		
		// 원본 배열을 정방향 순회
//		for (int i = 0; i < charArr.length; i++)
//			nextArr[(charArr.length - 1) - i] = charArr[i];
//		
//		System.out.println(Arrays.toString(nextArr));
		
		
		// 2. 원본 배열에서 swap
		
		char[] charArr2 = str.toCharArray();
		System.out.println(Arrays.toString(charArr2));
		
		for (int i = 0; i < charArr2.length / 2; i++) {
			char temp = charArr2[i];
			charArr2[i] = charArr2[(charArr.length - 1) - i];
			charArr2[(charArr.length - 1) - i] = temp;
		}
		
		System.out.println(Arrays.toString(charArr2));

		// String에 이어붙이기

//		String nextStr = "";
//		
//		for (int i = 0; i < charArr2.length; i++)
//			nextStr += charArr2[(charArr.length - 1) - i];
//		
//		System.out.println(nextStr);
		
	}
}
