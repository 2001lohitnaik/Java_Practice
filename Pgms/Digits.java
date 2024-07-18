class Digits
{
	public static void countDig(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;

		}
		System.out.println("Digits are "+count);
	}
	public static void main(String args[])
	{
		countDig(345);
	}
}