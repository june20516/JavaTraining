package inheritance;

import inheritance.BankSuper;

public class Savings extends BankSuper {

	private static int count;
	private long monthlyDeposit;
	private long depositAmount;

	@Override
	protected void createAccountNumber() {
		accountNumberStr = String.format("%s%05d-%06d", BankCode.SAVINGS_PREFIX, ++count, getTotalCount()); 
	}

	@Override
	public void calc() {
		depositAmount = monthlyDeposit * (period * 12);
		interestRate = (int) (depositAmount * BankCode.SAVINGS_RATE / 100);
		totalAmount = depositAmount + interestRate;
	}

	@Override
	public String toString() {
		return String.format(
				"Savings [monthlyDeposit=%s, depositAmount=%s, accountNumberStr=%s, customName=%s, period=%s, interestRate=%s, totalAmount=%s]",
				monthlyDeposit, depositAmount, accountNumberStr, customName, period, interestRate, totalAmount);
	}

}
