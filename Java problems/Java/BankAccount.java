import java.util.Scanner;
class BankAccount
{
	void deposit(long amnt)
	{
		System.out.println("Deposit amount : "+amnt);
	}
	void withdrawal(long amnt)
	{
		System.out.println("Withdraw amount : "+amnt);
	}
}

class SavingsAccount extends BankAccount
{
	void withdrawal(long amnt)	
	{
		if(amnt<100)
		{
			System.out.println("Unable to withdraw");
		}
		else
		{
			System.out.println("Withdraw success");
		}
	}
}

class BankAccounts
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long amnt = s.nextLong();
		BankAccount b=new BankAccount(amnt);
		SavingsAccount s=new SavingsAccount();
		b.deposit(amnt);
		b.withdrawal(amnt);
		s.withdrawal(amnt);
	}
}
	