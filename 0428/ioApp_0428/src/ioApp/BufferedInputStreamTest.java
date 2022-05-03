package ioApp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		
		try {
			String filename = "C:\\io\\io.txt";
			bis = new BufferedInputStream(new FileInputStream(filename),1024);
			
			byte[] buf = new byte[256];
			int readByte = 0;
			while((readByte=bis.read(buf,0,buf.length))!= -1) {
				System.out.write(buf,0,readByte);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(bis != null) 
					bis.close();
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	
	}
