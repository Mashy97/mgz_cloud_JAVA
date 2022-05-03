package ioApp;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		String pathname = "C:/io/io.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			String filename = file.getName();
			long fileSize = file.length();
			System.out.printf("���ϸ� %s%n",filename);
			System.out.printf("���� ũ�� %dbytes%n",fileSize);
		}
		else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
}
