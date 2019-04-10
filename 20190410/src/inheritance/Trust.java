package inheritance;

import inheritance.BankSuper;

public class Trust extends BankSuper {

	private static int count;
	private long trustAmount;
	private int monthlyInterest;

	@Override
	protected void createAccountNumber() {
		accountNumberStr = String.format("%s%05d-%06d", BankCode.TRUST_PREFIX, ++count, getTotalCount());
	}

	@Override
	public void calc() {
		double yearInterest = trustAmount * BankCode.TRUST_RATE / 100;
		interestRate = (int) (yearInterest * period); 
		monthlyInterest = (int) (yearInterest / 12);
		totalAmount = trustAmount + interestRate;
	}

	@Override
	public String toString() {
		return String.format(
				"Trust [trustAmount=%s, monthlyInterest=%s, accountNumberStr=%s, customName=%s, period=%s, interestRate=%s, totalAmount=%s]",
				trustAmount, monthlyInterest, accountNumberStr, customName, period, interestRate, totalAmount);
	}

}