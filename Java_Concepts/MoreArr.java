public class MoreArr
{
	public static void main(String args[])
	{
		int nums[]=new int[4];

		for(int i=0;i<nums.length;i++)
		{
			nums[i]=(int)(Math.random()*10);
		}

		for(int j=0;j<nums.length;j++)
		{
			System.out.println(nums[j]);
		}
	}
}