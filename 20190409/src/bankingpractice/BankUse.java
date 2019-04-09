package bankingpractice;

public class BankUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Loan customer1 = new Loan();
//		System.out.println(customer1);
//		Loan customer2 = new Loan();
//		System.out.println(customer2);
//		Loan customer3 = new Loan();
//		System.out.println(customer3);
//		Loan customer4 = new Loan();
//		System.out.println(customer4);
//		System.out.println(customer1);

//		Loan[] customers = {new Loan(), new Loan(), new Loan()};
//		Loan[] customers2 = new Loan[3];
//		
//		Savings[] savings = new Savings[2];
		
//		for (Savings saving : savings) {
//			saving = new Savings();
//		}   // 인스턴스가 배열 안으로 생성되지 않음.. 아마도 for each 에서는 값만을 복사해 가져오나보다.
		
//		for (int i = 0; i<savings.length; i++) {
//			savings[i] = new Savings();
//		}
//		for (Savings saving : savings) {
//			System.out.println(saving);
//		}
		
//		Trust[] trust = new Trust[2];
//		
//		for(int i = 0; i<trust.length; i++) {
//			trust[i] = new Trust();
//		}
//		for (Trust trut : trust) {
//			System.out.println(trut);
//		}
//
		BankBook customer = new BankBook();
		customer.startService();
	}

}
