package ioApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FileCopy03 {
	
		public static void main(String[] args) {
			BufferedReader br = null;
			PrintWriter pw = null;
			try { 
				br = new BufferedReader(new FileReader("C:/img/src/string.txt"));
				pw = new PrintWriter(new FileWriter("C:/img/dest/string.txt"));
				
				String str = null;
				while((str =br.readLine()) != null){
					pw.println(str);
				}
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try {
					if(br != null) 
						br.close();
					if(pw != null)
						pw.close();
					}catch(Exception e2) {
						e2.printStackTrace();
					}
			}
		}
	}
