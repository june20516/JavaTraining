package homeworkreview;

public class UseBQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankQueingSystem ref1 = new BankQueingSystem();
		System.out.println("ref1 : "+ ref1);
		BankQueingSystem ref2 = new BankQueingSystem();
		System.out.println("ref2 : "+ ref2);
		BankQueingSystem ref3 = new BankQueingSystem();
		System.out.println("ref3 : "+ ref3);
		BankQueingSystem ref4 = new BankQueingSystem();
		System.out.println("ref4 : "+ ref4);
		
		System.out.println("총대기인원 : " + BankQueingSystem.count + " 내번호 : " + ref1.toString());
		
				
	}

}
