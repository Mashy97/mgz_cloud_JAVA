package functionApp_0502;

import java.util.stream.Stream;

public class StreamTest03 {
	public static void main(String[] args) {
		Stream<Double> stream = Stream.of(1.5,2.5,6.2,1.0);
		
		stream.forEach(System.out::println);
		
	}
}
