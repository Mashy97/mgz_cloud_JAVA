package functionApp_0502;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r = () -> {
			Thread thread = Thread.currentThread();
			String threadName = thread.getName();
			System.out.println(threadName +" thread is running");
		};
		r.run();
	}
}
