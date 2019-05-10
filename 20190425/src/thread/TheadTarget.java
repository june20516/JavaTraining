package thread;

public class TheadTarget implements Runnable{

	
	
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		int runCount = 0;
		String crThreadName = Thread.currentThread().getName();
		for(String c : crThreadName.split("")) {
			try {
				System.out.println(c + "		(R runCount :" + ++runCount + ")");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
	}
}
