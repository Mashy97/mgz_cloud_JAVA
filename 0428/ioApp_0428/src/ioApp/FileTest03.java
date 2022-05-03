package ioApp;

import java.io.File;

public class FileTest03 {
	public static void main(String[] args) {
		String pathname = "C:/io";
		File file = new File(pathname);
		
		boolean isSuccess = file.mkdir();
		if(isSuccess) {
			System.out.printf("%s 디덱토리가 생성되었습니다.",file.getName());
		}else {
			System.out.println("디텍도리 생성 실패!!");
		}
		}
}
