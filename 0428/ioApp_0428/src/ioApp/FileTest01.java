package ioApp;

import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		String pathname = "C:/io/io.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			file.delete();
			System.out.printf("%s ������ �����Ǿ����ϴ�.",file.getName());
			}else {
				System.out.printf("%s ���� ���� ����.",file.getName());
			}
	}
}
