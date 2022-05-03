package ioApp;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy02 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try { 
			fr = new FileReader("C:/img/src/string.txt");
			fw = new FileWriter("C:/img/dest/string.txt");
			
			char [] cbuf = new char [256];
			int readChar = 0;
			while((readChar = fr.read(cbuf))!=-1) {
				fw.write(cbuf,0,readChar);
			}
			System.out.println("파일 복사 완료");
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) 
					fr.close();
				if(fw != null)
					fw.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
		}
	}
}

