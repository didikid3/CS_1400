
public class SavingsAccount extends BankAccount {

	double interestRate;
	
	public SavingsAccount(double rate)
	{
		super();
		interestRate= rate;
	}
	
	public SavingsAccount(double rate, double initialBalance)
	{
		super(initialBalance);
		interestRate = rate;
	}
	
	public void addInterest()
	{
		deposit(getBalance()*interestRate/100);
	}
	
	public void close(BankAccount other)
	{
		transfer(getBalance(), other);
	}
}
