class FactEvenOdd
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of "+i+" is "+fact);
		}
		return fact;
	}
	public static void main(String args[])
	{
		if(factorial(1)%2==0)
		{
			System.out.println("It is Even");
		}
		else
		{
			System.out.println("It is Odd");

		}

	}

}
