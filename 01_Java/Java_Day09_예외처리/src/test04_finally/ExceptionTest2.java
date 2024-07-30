package test04_finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		// try ~ catch ~ finally => try with resources
		
		FileInputStream fis = null;
		
		try {
			// 이 블록 안에서 선언된 변수 => 이 블록 안에서만 쓸 수 있음.
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("예외가 발생했어요.");
		} finally {
			
		}
		
		System.out.println("======================");
		
		try(FileInputStream fis2 = new FileInputStream("test.txt")) {
			
		} catch(IOException e) {
			System.out.println("예외가 발생했어요.");
		}
		
		
	}
}
