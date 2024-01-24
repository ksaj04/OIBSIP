package ATMPROJECT;

import java.util.Scanner;

public class Atm {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******** WELCOME TO ATM *******");
		
		Scanner sc=new Scanner(System.in);
		boolean w=true;
		while(w) {
		System.out.println("1.Register\n2.Exit");
		
		int a1=sc.nextInt();
		
		if(a1==1)
		{
			System.out.println("Please enter user id for Register :");
			String userid=sc.next();
			System.out.println("please enter password for Register:");
			String password=sc.next();
			System.out.println("please enter your name :");
			String name=sc.next();
			
			System.out.println("please enter your Account Number :");
			long Accno=sc.nextLong();
			System.out.println("Registered successfully");
			
	         Account a=new Account(name,Accno);
			
			System.out.println();
			System.out.println("=====================");
			System.out.println("1.Login\n2.Exit");
			int a2=sc.nextInt();
			boolean w1=true;
			if(a2==1) {
				
			while(w1) {
			System.out.println("For Login please enter correct username and password");
			
			System.out.println("Please enter user id for Login :");
			String userid1=sc.next();
			System.out.println("please enter password for Login:");
			String password1=sc.next();
			
			
			
			if(userid.equals(userid1)&&password.equals(password1))
			{
				
				System.out.println("Login successfully");
				
				System.out.println("*****************************");
				
				boolean w3=true;
				
				while(w3) {
					System.out.println();
					System.out.println();
				System.out.println("======WELCOME TO OUR SERVICE======");
				System.out.println("What you are looking for ? ");
				System.out.println("1.Withdraw\n2.Deposit\n3.Transfer\n4.Transaction History\n5.Check Balance\n6.Exit");
				{
					int a3=sc.nextInt();
					
					switch(a3)
					{
					
					case 1:
						System.out.println("Please enter an amount to withdraw : ");
						double withd=sc.nextDouble();
						a.withdraw(a,withd);
						
						break;
					case 2:
						System.out.println("Please enter an amount to Deposit : ");
						double depo=sc.nextDouble();
						a.deposit(depo);
						
						break;
					case 3:
						System.out.println("Please enter Recipient Account Number :");
						long recNum=sc.nextLong();
						System.out.println("Please enter an amount to Transfer : ");
						double trans=sc.nextDouble();
						a.transfer(recNum,trans);
					
						break;
					case 4:
						a.transactionHistory();
						break;
					case 5:
						a.checkBalance();
						break;
					case 6:
						//Exit
						w1=false;
						w=false;
						w3=false;
						break;
					default:
	
						System.out.println("Invalid case Please enter valid case ");
					
					
					}
					
					
				}}
				
			}
			else
			{
				System.out.println("Userid and Password is Incorrect");
				System.out.println("Please enter correct user id and password for Login :");
			}
			}
			
			}
			else if(a2==2)
			{
			    w1=false;
			    w=false;
			    System.out.println("Exit successfully");
			    System.out.println("Thank you");
			}

			else
			{
				System.out.println("Invalid case please enter valid case");
			}
		}
		
		
		else if(a1==2)
		{
			w=false;
			System.out.println("Exit successfully");
			System.out.println("Thank you");
		}
		else
		{
			System.out.println("Invalid case please enter valid case");
		}

		}
	}
	
	
}
