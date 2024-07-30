package test01_file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		
		File f = new File("dog.jpg");	// 상대경로를 쓰고 있다.
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isAbsolute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length() + "bytes");
	}
}
