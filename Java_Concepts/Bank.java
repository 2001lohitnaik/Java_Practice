//Own
import java.util.Scanner;
class Account
{
	Scanner sc=new Scanner(System.in);
	String customer;
	String accno;
	double balance;
	public Account(String customer,String accno)
	{
		System.out.println("Welcome To Our Bank");
		this.customer=customer;
		this.accno=accno;
		this.balance=balance;
	}

	public void dep()
	{
		System.out.println("Enter The Amount To Deposit: ");
		double amount=sc.nextDouble();
		balance=balance+amount;
		System.out.println(amount+" is Credited To Your Account Number "+accno);
		System.out.println("Current Balance is: "+balance);
		System.out.println();
	}

	public void wdw()
	{
		System.out.println("Enter The Amount To Withdraw: ");
		double amount=sc.nextDouble();
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println(amount+" is Debited From Your Account Number "+accno);
		}
		else
		{
			System.out.println("Insufficient Balance");
			System.out.println("Current Balance is: "+balance);
		}
		System.out.println();
	}

	public void display()
	{
		System.out.println("Customer Name is: "+customer);
		System.out.println("Account Number is: "+accno);
		System.out.println("Balance is: "+balance);
		System.out.println();
	}
}

class Savings extends Account
{
	String ifsc;
	public Savings(String customer,String accno,String ifsc)
	{
		super(customer,accno);
		this.ifsc=ifsc;
	}

	public void display1()
	{
		super.display();
		System.out.println("IFSC Code is: "+ifsc);
	}
}

class Current extends Savings
{
	int years;

	public Current(String customer,String accno,String ifsc,int years)
	{
		super(customer,accno,ifsc);
		this.years=years;
	}

	public void display2()
	{
		super.display1();
		System.out.println("Account Opened Year is: "+years);
	}
}

public class Bank
{
	public static void main(String args[])
	{
		Current obj=new Current("Lohit","12345","KARB0000493",2016);
		obj.display2();
		obj.dep();
		obj.wdw();
		obj.display2();
	}
}