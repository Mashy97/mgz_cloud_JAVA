package functionApp_0502;

public interface CustomerInterface<T> {
	T mycall(int a, int b);
	
	default void printDefault() {
		System.out.println("Hello, Default");
	}
	
	static void printStatic() {
		System.out.println("Hello, Static");
	}
}
