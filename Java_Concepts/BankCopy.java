class Account
{
	int acno;
	double balance;
	String owner;
	public Account(int acno,double balance, String owner)
	{
		this.acno=acno;
		this.balance=balance;
		this.owner=owner;
	}
	public void deposit(double amt)
	{
		this.balance=balance+amt;
	}
	public void withdraw(double amt)
	{
		if (amt<=this.balance)
		{
			System.out.println("withdraw succesful");
			this.balance=this.balance-amt;
		}
		else
		{
			System.out.println("insufficient fund");
		}
	}
	public void display()
	{
		System.out.println(acno);
		System.out.println(balance);
		System.out.println(owner);
	}
}
class Savings extends Account
{
	double roi;
	public Savings(int acno,double balance,String owner,double roi)
	{
		super(acno,balance,owner);
		this.roi=roi;
	}
	public void calculateRoi()
	{
		System.out.println(roi);
	}
	public void display1()
	{
		super.display();
		System.out.println(roi);
	}
}
class Current extends Account
{
	double minBal;
	public Current (int acno,double balance,String owner,double minBal)
	{
		super(acno,balance,owner);
		this.minBal=minBal;
	}
	public void showMinBal()
	{
		System.out.println(minBal);
	}
	public void display2()
	{
		super.display1();
		System.out.println(minBal);
	}
}
public class BankCopy
{
	public static void main(String[] args) 
	{
		Savings s1=new Savings(001,10000.00,"yash",2.5);
		Current c1=new Current(001,10000.00,"yash",2500);
		s1.withdraw(5000);
		s1.display();
	}
}