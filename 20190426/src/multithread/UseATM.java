package multithread;

public class UseATM {
	public static void main(String[] args) {
		ATMSample atmSample = new ATMSample();
		Thread mm = new Thread(atmSample, "엄마");
		Thread ff = new Thread(atmSample, "아빠");
		Thread bb = new Thread(atmSample, "형");
		Thread ss = new Thread(atmSample, "누나");
		
		mm.start();
		ff.start();
		bb.start();
		ss.start();
	}
}
