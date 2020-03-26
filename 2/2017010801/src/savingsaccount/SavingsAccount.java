package savingsaccount;

public class SavingsAccount {
	static double annualInterestRate = 0.06;
	private double savingsBalance;
	SavingsAccount(double a) {
		savingsBalance = a;
	}
	double calculateMonthlyInterest() {
		double a = savingsBalance*annualInterestRate/12;
		savingsBalance += a;
		return a;
	}
	void modifyInterestRate(double a) {
		annualInterestRate = a;
	}
		
}
