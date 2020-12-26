
public class CheckingAccount extends BankAccount{
	int transactionCount;
	
	final int FREE_TRANSACTIONS = 3;
	final double TRANSACTION_FEE = 2.0;
	final double CLOSING_FEE = 5.0;
	final double MAINTENANCE_FEE = 10.0;
	
	public CheckingAccount()
	{
		super();
		transactionCount = 0;
	}
	
	public CheckingAccount(double initialBalance)
	{
		super(initialBalance);
		transactionCount = 0;
	}
	
	//Check if user has already used the amount of free transaction first
	public void deposit(double amount)
	{
		transactionCount += 1;
		if(transactionCount > FREE_TRANSACTIONS)
		{
			super.deposit(amount-TRANSACTION_FEE);
		}
		else
			super.deposit(amount);
	}
	
	//Check if user has already used the amount of free transaction first
	public void withdraw(double amount)
	{
		transactionCount += 1;
		if(transactionCount > FREE_TRANSACTIONS)
		{
			super.withdraw(amount+TRANSACTION_FEE);
		}
		else
			super.withdraw(amount);
	}
	
	public void deductMaintenanceFee()
	{
		super.withdraw(MAINTENANCE_FEE);
		transactionCount = 0;
	}
	
	public void close(BankAccount other)
	{
		transactionCount = 0;
		super.withdraw(CLOSING_FEE);
		transfer(getBalance(), other);
	}
}
