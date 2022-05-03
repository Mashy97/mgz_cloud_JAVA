package ioApp;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
			try {
				fr = new FileReader("C:/io/String.txt");
				
				char[] cbuf = new char[256];
				int readChar = 0;
				while((readChar =fr.read(cbuf)) != -1) {
					String str = new String(cbuf,0,readChar);
					System.out.print(new String(cbuf,0,readChar));
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try {
					if(fr != null) 
						fr.close();
					}catch(Exception e2) {
						e2.printStackTrace();
					}
				}
			}
	}
