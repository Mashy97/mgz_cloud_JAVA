package arrayApp;

import java.util.ArrayList;

//1, 2, 3, 4, 5
public class ArrayTest01 {
	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		for(Integer temp : obj) {
			System.out.printf("%d%n",temp);
		}
	}
}
