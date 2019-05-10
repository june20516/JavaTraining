package thread;

public class ThreadTest1 {
public static void main(String[] args) {
	Thread thread = Thread.currentThread();
	System.out.println(thread.getPriority());	//thread의 우선순위
	System.out.println(Thread.MAX_PRIORITY);	//Thread의 최대 우선순위
	System.out.println(Thread.MIN_PRIORITY);	//Thread의 최소 우선순위
	
	System.out.println(thread.getId());
	System.out.println(thread.getName());
	System.out.println(thread.isDaemon());
	System.out.println(thread.activeCount());
	System.out.println(thread.isAlive());
	
}
}
