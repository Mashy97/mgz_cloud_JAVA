package functionApp_0502;
import java.util.ArrayList;
import java.util.Arrays;


public class StreamTest08 {
	public static void main(String[] args) {
		String [] arr = {"java", "spring","jps","jsp","mysql"};
		 ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		 
//		 list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 list.stream().filter(x -> x.startsWith("j")).forEach(System.out::println);
//		 .filter(account -> account.getName().startsWith("¿œ")).skip(1).forEach(System.out::println);
	}
}
