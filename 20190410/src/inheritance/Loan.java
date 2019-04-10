package inheritance;

import inheritance.BankSuper;

public class Loan extends BankSuper {

	private static int count;

	protected long principal;
	protected long monthlyPayment;

	@Override
	protected void createAccountNumber() {
		accountNumberStr = String.format("%s%05d-%06d", BankCode.LOAN_PREFIX, ++count, getTotalCount()); 
	}

	@Override
	public void calc() {
		interestRate = (int) (principal * BankCode.LOAN_RATE / 100); 
		totalAmount = principal + interestRate;
		monthlyPayment = totalAmount / (period * 12);
	}

	@Override
	public String toString() {
		return String.format(
				"Loan [principal=%s, monthlyPayment=%s, accountNumberStr=%s, customName=%s, period=%s, interestRate=%s, totalAmount=%s]",
				principal, monthlyPayment, accountNumberStr, customName, period, interestRate, totalAmount);
	}

}