import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

		public static void main(String[] args) {
			HashMap<String, Contact> map = new HashMap<String,Contact>();
			
			Contact c01 = new Contact("일길동","010-1111-1111","java01@gamil.com");
			Contact c02 = new Contact("이길동","010-2222-2222","java02@gamil.com");
			Contact c03 = new Contact("삼길동","010-3333-3333","java03@gamil.com");
			Contact c04 = new Contact("삼길동","010-4444-4444","java04@gamil.com");
			
			map.put(c01.getName(),c01);
			map.put(c02.getName(),c02);
			map.put(c03.getName(),c03);
			map.put(c04.getName(),c04);
			
			Set<String> keys = map.keySet();
			for(String key : keys) {
				Contact temp = map.get(key);
				System.out.println("key : "+key);
				System.out.println("value : "+temp.toString());
			}
		} 
		
}
