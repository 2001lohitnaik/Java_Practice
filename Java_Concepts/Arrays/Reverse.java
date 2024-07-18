class Reverse
{
	static void reverse(int[] ar)
	{
		int i=0;
	    int j=ar.length-1;
	    int temp;
		while(i<j)
		{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String args[])
	{
		int[] ar={1,2,3,4,5,6,7,8};
		System.out.println("Before Reverse");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

		System.out.println("\nAfter Reverse");
		reverse(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}
}