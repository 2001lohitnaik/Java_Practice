public class ArrPrg
{
	public static void main(String args[])
	{
		int nums[] = {2,3,3,4,4,5,6};
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(i==j)
				{
					System.out.println("Duplicate");
				}
			}
		}
	}
}