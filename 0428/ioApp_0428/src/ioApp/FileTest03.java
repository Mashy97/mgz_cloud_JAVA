package ioApp;

import java.io.File;

public class FileTest03 {
	public static void main(String[] args) {
		String pathname = "C:/io";
		File file = new File(pathname);
		
		boolean isSuccess = file.mkdir();
		if(isSuccess) {
			System.out.printf("%s ���丮�� �����Ǿ����ϴ�.",file.getName());
		}else {
			System.out.println("���ص��� ���� ����!!");
		}
		}
}
