package thread;

public class HelloThread extends Thread {
	private String name;
	private static int runCount = 0;
	
	public HelloThread(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void run() {
		for (String c : this.name.split("")) {
		System.out.println(c + "		(H1 runCount : " + ++runCount + ")");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println(name + "의 name : " + Thread.currentThread().getName());
		System.out.println(name + ".run()을 return합니다.");
		return;
	}
}
