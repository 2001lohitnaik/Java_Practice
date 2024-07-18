import Pack.*;

public class Pack
{
	public static void main(String args[])
	{
		AddSub obj=new AddSub();
		int s1=obj.add(2,3);
		System.out.println(s1);
		int s2=obj.sub(2,3);
		System.out.println(s2);
		MulDiv obj2=new MulDiv();
		int s3=obj2.mul(2,3);
		System.out.println(s3);
		int s4=obj2.div(2,3);
		System.out.println(s4);		
	}
}