package ioApp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileCopy01 {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("C:/img/src/img.jpg")) ;
			bos = new BufferedOutputStream(new FileOutputStream("C:/img/dest/img.jpg"));
			byte [] buf = new byte[1024];
			int readByte = 0;

			while((readByte=bis.read(buf))!= -1) {
				bos.write(buf,0,readByte);
				bos.flush();
			}
			System.out.println("파일 복사 완료");
	
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(bis != null) 
					bis.close();
				if(bos != null)
					bos.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
}
