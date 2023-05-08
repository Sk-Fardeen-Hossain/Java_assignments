//----------Problem 2(a): Implementation of Bank account management (Withoutconstructor)------------





import java.util.Scanner;
class Account {
	String name, type, acc_number;
	double balance;

	void display()
	{
		System.out.println("Current balance: Rs." + balance);
	}
	void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposit of " + amount + " successful. New balance: " +balance);
	}
	void withdraw(double amount)
	{
		if (balance < amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawal of " + amount + " successful. New balance: " +balance);
		}
	}
	double calc_interest()
	{
		return 0.0;
	}
	void check_min()
	{
		System.out.println("Service charge not applicable for savings account");
	}
}
class Curr_acct extends Account {
	double min, charge;
	void withdraw(double amount)
	{
		check_min();
		super.withdraw(amount);
	}
	void check_min()
	{
		if (balance < min)
		{
			balance -= charge;
			System.out.println("Rs " + charge + " service charge applied. New balance is: "+ balance);
		}
		else
		{
			System.out.println("balance is above minimum!");
		}
	}
}
class Sav_acct extends Account {
	double interest_rate;
	double calc_interest()
	{
		return balance * interest_rate;
	}
}
public class BankingDB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String name = sc.nextLine();
		System.out.print("Enter account number: ");
		String acc_number = sc.nextLine();
		System.out.print("Enter account type (savings/current): ");
		String type = sc.nextLine();
		Account acc;
		if (type.equalsIgnoreCase("savings"))
		{
			acc = new Sav_acct();
		}
		else if (type.equalsIgnoreCase("current"))
		{
			acc = new Curr_acct();
		}
		else
		{
			System.out.println("Account type is invalid");
			return;
		}
		acc.name = name;
		acc.acc_number = acc_number;
		acc.type = type;
		System.out.print("Enter initial deposit amount: ");
		double initialDeposit = sc.nextDouble();
		System.out.println();
		acc.deposit(initialDeposit);
		while (true)
		{
			System.out.println("\n1 to Deposit");
			System.out.println("2 to display balance");
			System.out.println("3 to calculate interest");
			System.out.println("4 to withdraw");
			System.out.println("5 to check minimum status");
			System.out.println("6 to exit");
			System.out.print("\nEnter your choice: ");
			int op = sc.nextInt();
			switch (op)
			{
				case 1:
				System.out.print("Enter amount: ");
				double amount = sc.nextDouble();
				System.out.println();
				acc.deposit(amount);
				break;
			
				case 2:
				System.out.println();
				acc.display();
				break;

				case 3:
				double interest = acc.calc_interest();
				System.out.println();
				System.out.println("Interest: " + interest);
				break;

				case 4:
				System.out.print("Enter amount: ");
				double amt = sc.nextDouble();
				System.out.println();
				acc.withdraw(amt);
				break;

				case 5:
				acc.check_min();
				break;
	
				case 6:
				System.out.println();
				System.exit(0);
				break;

				default:
				System.out.println();
				System.out.println("Invalid choice");
			}		
		}
	}
}


/*-------OUTPUT-------
Enter customer name: Student
Enter account number: 2323
Enter account type (savings/current): savings
Enter initial deposit amount: 500

Deposit of 500.0 successful. New balance: 500.0

1 to Deposit
2 to display balance
3 to calculate interest
4 to withdraw
5 to check minimum status
6 to exit

Enter your choice: 3

Interest: 0.0

1 to Deposit
2 to display balance
3 to calculate interest
4 to withdraw
5 to check minimum status
6 to exit

Enter your choice: 1
Enter amount: 100

Deposit of 100.0 successful. New balance: 600.0

1 to Deposit
2 to display balance
3 to calculate interest
4 to withdraw
5 to check minimum status
6 to exit

Enter your choice: 6*///

