package ATMPROJECT;

public class Account {
	
	private static  String name;
	private static String username;
	private static String password;
	private static long Accountnum;
	private static double balance;
	private static int transactions=0;
	private static String transactionHistory="";
	
	{
		this.balance=5000;
	}
	
	Account(String name1,long Accountnum)
	{
		this.name=name1;
		this.Accountnum=Accountnum;
	}
	
	public void withdraw(Account a,double amount)
	{
		try {
		if(amount<=balance)
		{
			balance=balance-amount;
			transactions++;
			
			System.out.println("## Withdraw Successfully ##");
			
			String st= "Rs ."+amount+" Withdrawed successfully ";
			transactionHistory=transactionHistory.concat(st);
			System.out.println();
			System.out.println();
			
		}
		else
		{
			System.out.println("Account Balance Insufficient!! Please check and re-try");
		}}catch(Exception e)
		{
			
		}
		
	}
	
	public void deposit(double deposit)
	{
		
		try {
			
			balance=balance+deposit;
			transactions++;
			System.out.println("^^  Deposited Successfully  ^^");
			String s1="Rs ."+deposit+" Deposited Successfully ";
			transactionHistory=transactionHistory.concat(s1);
			System.out.println();
			System.out.println();
		}catch(Exception e)
		{
			
		}
	
		
	}
	
	public void transfer(long recieptnum,double amount)
	{
		
		try {
			if(amount<=balance) {
		  balance=balance-amount;
			transactions++;
			System.out.println("@@ Transfered Successfully @@");
			String s2="Rs ."+amount+" transfered to "+recieptnum+" Successfully ";
			transactionHistory=transactionHistory.concat(s2);
			System.out.println();
			System.out.println();
			}
			else
			{
				System.out.println("Insufficient Fund !!!!!!");
			}
		}catch(Exception e)
		{
		
			
		}

	}
	
	public void transactionHistory()
	{
		try {
			if ( transactions == 0 ) {
				System.out.println("\nEmpty");
			}
			else {
			System.out.println("\n"+transactionHistory);
			}
			
		}catch(Exception e)
		{
			
			
		}
		
	}
	public void checkBalance()
	{
		System.out.println("Available Balance is :"+balance);
	}

}
