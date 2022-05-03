package ioApp;

import java.io.InputStream;

public class KeyboardTest {
	public static void main(String[] args) {
		
		try {
		InputStream is = System.in;	
		
		System.out.print("input the : ");
		int data = is.read();
		System.out.printf("data : %c%n",(char)data);
		is.read();
		is.read();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}	
