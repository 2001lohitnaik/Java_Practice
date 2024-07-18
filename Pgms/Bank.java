import java.util.Scanner;
class BankDet
{
	Scanner sc=new Scanner(System.in);
	float Total_Amount=0;

	public void deposit()
	{
		System.out.println("Enter The Amount To Be Deposit");
		float dep=sc.nextFloat();
		Total_Amount=Total_Amount+dep;
		System.out.println(dep+" is Credited");
	}

	public void withdraw()
	{
		System.out.println("Enter The Amount To Be Withdraw");
		float wtd=sc.nextFloat();
		if(wtd<=Total_Amount)
		{
			Total_Amount=Total_Amount-wtd;
			System.out.println(wtd+" is Debited");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}

	public void checkBal()
	{
		System.out.println("Current Balance is: "+Total_Amount);
	}
}
public class Bank
{

	public static void main(String args[])
	{
		BankDet tra=new BankDet();
		tra.deposit();
		tra.checkBal();
		tra.withdraw();
		tra.checkBal();
		
	}
}