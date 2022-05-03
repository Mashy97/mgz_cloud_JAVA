
public class StringBuilderTest_0425 {
	public static void main(String[] args) {
		
		StringBuilder obj = new StringBuilder();
		
		obj.append("Hello, ");
		obj.append("JAVA!!");
		
		String str = obj.toString();
		
		System.out.println(str);
		
		int temp = obj.length();
		System.out.println(temp);
		
		obj.delete(0,temp);
		temp = obj.length();
		System.out.println(temp);
		obj.append("HI");
		System.out.println(obj.toString());
	}
}
