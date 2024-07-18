public class Arr
{
	public static void main(String args[])
	{
		int nums[]={3,7,2,4};
		nums[0]=6;
		System.out.println(nums[0]);

		int nums1[]=new int[4];
		nums1[0]=2;
		nums1[1]=3;
		nums1[2]=4;
		nums1[3]=5;

		for(int i=0;i<4;i++)
		{
			System.out.println(nums1[i]);
		}
	}
}