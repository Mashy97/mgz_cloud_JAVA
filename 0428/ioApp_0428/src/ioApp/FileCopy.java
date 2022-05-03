package ioApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/img/src/img.jpg");
			fos = new FileOutputStream("C:/img/dest/img.jpg");
			byte [] buf = new byte[1024];
			int readByte = 0;
			int total = 0;
			while((readByte=fis.read(buf))!= -1) {
				total += readByte;
				fos.write(buf,0,readByte);
			}
			System.out.printf("총 파일 크기 : %,dbytes%n",total);
			System.out.println("파일 복사 완료");
			
			
		
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) 
					fis.close();
				if(fos != null)
					fos.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	
}

