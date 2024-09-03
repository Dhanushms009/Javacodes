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
			super.withdrawal(amnt);
		}
	}
}

class BankAccounts
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long amnt = sc.nextLong();
		BankAccount b=new SavingsAccount();
		//SavingsAccount s=new SavingsAccount();
		b.deposit(amnt);
		b.withdrawal(amnt);
		//s.withdrawal(amnt);
	}
}
	