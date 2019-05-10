package thread;

public class ThreadTest2 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread("1st");
		thread.start();	//same as thread.run();
		
		//thread 만들어보기
		Thread thread2 = new HelloThread("이수연");
		Thread thread3 = new HelloThread( "장진선");
		
		//runnable 을 implements 받아 생성해보기
		Runnable target = new TheadTarget();
		Thread thread4 = new Thread(target,"이준호");
		Thread thread5 = new Thread(target,"황준우");
		
		
		Thread thread6 = new HelloThread2("장한솔");
		thread6.setPriority(Thread.MIN_PRIORITY);
		Thread thread7 = new HelloThread2("최정제");
		thread7.setPriority(Thread.MAX_PRIORITY);
		
		//join 사용해보기
		Thread thread8 = new JoinThread("나영균");
		Thread thread9 = new JoinThread("김범홍");
		Thread thread10 = new JoinThread("김정수");
		
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		
		thread10.join(4000);
		
		System.out.println(thread8.getName() + thread8.isAlive());
		System.out.println(thread9.getName() + thread9.isAlive());
		System.out.println(thread10.getName() + thread10.isAlive());
		System.out.println(Thread.currentThread().getName() + " is End.");
		
	}
}
