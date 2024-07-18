import java.util.Scanner;
class BankDetail
{
	BankDetail()
	{
		System.out.println("Welcome To Our Bank");
	}

	Scanner sc=new Scanner(System.in);
	float Total_Amount=0;

	public void deposit()
	{
		System.out.println("Enter The Amount To Be Deposit");
		float dep=sc.nextFloat();
		Total_Amount=Total_Amount+dep;
		System.out.println(dep+ " is Credited To Your Account");
	}

	public void withdraw()
	{
		System.out.println("Enter The Amount To Be Withdraw");
		float wd=sc.nextFloat();
		if(Total_Amount>=wd)
		{
			Total_Amount=Total_Amount-wd;
			System.out.println(wd+" is Debited From Your Account");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}

	}

	public void checkBal()
	{
		System.out.println("Current Balance is "+Total_Amount);
	}
}
public class Banking
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankDetail tra=new BankDetail();
		int ch;
		do
		{
			System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Exit");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					tra.deposit();
					break;

				case 2:
					tra.withdraw();
					break;

				case 3:
					tra.checkBal();
					break;

				case 4:
					System.out.println("See You Soon");
					break;

				default:
					System.out.println("Please Enter Valid Choice");
			}
		}
		while(ch!=4);
	}
}