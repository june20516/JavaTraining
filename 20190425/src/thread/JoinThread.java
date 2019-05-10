package thread;

public class JoinThread extends Thread {
	private String name;
	private static int runCount=0;
	
	public JoinThread(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void run() {
		for (String c : this.name.split("")) {
		System.out.println(c + "		(J runCount : " + ++JoinThread.runCount + ")");
		}
		System.out.println(name + "의 name : " + Thread.currentThread().getName());
		System.out.println(name + ".run()을 return합니다.");
		return;
	}
}
