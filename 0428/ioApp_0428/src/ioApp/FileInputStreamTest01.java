package ioApp;

import java.io.FileInputStream;

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			String filename = "C:\\io\\io.txt";
			fis = new FileInputStream(filename);
			
			byte[] buf = new byte[256];
			int readByte = 0;
			while((readByte=fis.read(buf))!= -1) {
				System.out.write(buf,0,readByte);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) 
					fis.close();
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	
	}

