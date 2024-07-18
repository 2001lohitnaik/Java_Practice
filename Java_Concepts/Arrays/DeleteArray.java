import java.util.*;
class DeleteArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,k;
		int[] firstArray={1,2,3,4,5};
		System.out.println("Original Array"+Arrays.toString(firstArray));
		int index=2;
		int[] newArray=new int[firstArray.length-1];

		for(i=0,k=0;i<firstArray.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			newArray[k++]=firstArray[i];
		} 
		System.out.println("New Array"+Arrays.toString(newArray));
	}
}