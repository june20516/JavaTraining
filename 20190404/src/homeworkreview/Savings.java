package homeworkreview;

public class Savings {
	private String accountNumber = "150-";
	private static int count;
	
	public Savings(){
		accountNumber += ++count;
		
	}
	
	public String toString() {
		return "°èÁÂ¹øÈ£ : " + accountNumber;
		
	}
}
