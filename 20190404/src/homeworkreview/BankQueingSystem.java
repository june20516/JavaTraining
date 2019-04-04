package homeworkreview;

public class BankQueingSystem {
	public static int count;
	private int waitingNum;
	
	public BankQueingSystem() {
		waitingNum = ++count;
	}
	
	public String toString() {
		return "¹øÈ£: " + waitingNum; 
	}
	
	
}
