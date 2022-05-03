package ioApp;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		String pathname = "C:/io/io.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			String filename = file.getName();
			long fileSize = file.length();
			System.out.printf("파일명 %s%n",filename);
			System.out.printf("파일 크기 %dbytes%n",fileSize);
		}
		else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
