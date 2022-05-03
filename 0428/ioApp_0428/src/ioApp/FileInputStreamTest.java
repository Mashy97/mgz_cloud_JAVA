package ioApp;

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		
			FileInputStream fis = null;
		try {
			String filename = "C:/io/io.txt";
			fis = new FileInputStream(filename);
			
			int readByte = 0;
			while((readByte=fis.read()) != -1) {
				System.out.printf("%c",(char)readByte);
			}
		}catch (Exception e) {
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

			
