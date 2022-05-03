package ioApp;

import java.io.File;

public class FIleTest02 {

	public static void main(String[] args) {
		File file = new File("C:/io/io.txt");
		
		try {
			boolean isSuccess = file.createNewFile();
			if(isSuccess) {
				System.out.printf("%s 파일이 생성 되었습니다.",file.getName());
			
			}else {
				System.out.printf("%s 파일 생성 실패!%n",file.getName());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
