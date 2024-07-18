import java.util.Scanner;
class User
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter The Size Of The Array");
		size=sc.nextInt();
		System.out.println("Enter The Elements");
		int[] ar=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Elements Are:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		}

	}
}