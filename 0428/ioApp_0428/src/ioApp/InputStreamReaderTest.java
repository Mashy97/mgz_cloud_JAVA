package ioApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Input Data : ");
			String str = br.readLine();
			
			System.out.printf("%s%n",str);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(br != null) 
					br.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
}
