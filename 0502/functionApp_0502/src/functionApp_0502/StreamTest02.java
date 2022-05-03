package functionApp_0502;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest02 {
	public static void main(String[] args) {
		String[] colors = {"red","green","blue","gray","purple"};
		Stream<String> stream = Arrays.stream(colors);
		stream.forEach(System.out::println);
	}
}
