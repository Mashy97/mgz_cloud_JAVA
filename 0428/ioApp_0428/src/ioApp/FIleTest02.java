package ioApp;

import java.io.File;

public class FIleTest02 {

	public static void main(String[] args) {
		File file = new File("C:/io/io.txt");
		
		try {
			boolean isSuccess = file.createNewFile();
			if(isSuccess) {
				System.out.printf("%s ������ ���� �Ǿ����ϴ�.",file.getName());
			
			}else {
				System.out.printf("%s ���� ���� ����!%n",file.getName());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
