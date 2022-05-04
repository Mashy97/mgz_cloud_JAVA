package functionApp_0502;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest06 {
	public static void main(String[] args) {
//		String str = "I study hard";
//		String[] arr = str.split(" +");
//		for(String temp :arr) {
//			System.out.println(temp);
//		}
		
		String [] arr = { "I study hard", "You study JAVA", "I am hungry"};
		
		Arrays.stream(arr)
		.flatMap(s-> Stream.of(s.split(" +")))
		.forEach(System.out::println);
	}
}
