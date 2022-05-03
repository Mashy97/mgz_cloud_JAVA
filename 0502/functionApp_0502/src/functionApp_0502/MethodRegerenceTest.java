package functionApp_0502;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class Person{
	String name;
	String gender;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name ) {
		super();
		this.name = name;
	}
	
	public Person(String name , String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
}
public class MethodRegerenceTest {
	public static void main(String[] args) {
		Function<Integer, Integer> func = Math::abs;
		
		int result = func.apply(-5);
		System.out.println(result);
	
		String str = "java";
		Predicate<String> func02 = str::equals;
		boolean result01 = func02.test("Java");
		System.out.println(result01);

		Function<String, Person> func03= Person::new;
		Person p = func03.apply("일길동");
		 System.out.println(p.getName());
				
		BiFunction<String, String, Person> func04 = Person::new;
		p = func04.apply("이길동","남자");
		System.out.println(p.name+p.getGender());
		
		BiFunction<String, String, Person> func05 = Person::new;
		p = func05.apply("아이유","여자");
		System.out.println(p.name+p.getGender());
	}
}
