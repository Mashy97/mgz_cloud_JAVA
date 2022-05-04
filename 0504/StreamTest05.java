package functionApp_0502;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest05 {
	public static void main(String[] args) {
		
		List<List<String>> lists = Arrays.asList(Arrays.asList("a","b","c"),
									Arrays.asList("d","e","f"));
	
		lists.stream().flatMap(Collection::stream).forEach(System.out::println);
		
		String[][] arr = {{"a","b","c"},{"d","e","f"}};
		Stream<String[]> stream = Arrays.stream(arr);
		stream.flatMap(Arrays::stream); 
		Stream<String> stream01 = stream.flatMap(Arrays::stream);
		stream01.forEach(System.out::println);
		
	}
}
