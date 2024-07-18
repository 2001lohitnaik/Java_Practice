
public class InheritFir
{
	public static void main(String args[])
	{
		SciCal obj =new SciCal();
		int r1=obj.add(3,5);
		int r2=obj.sub(5,1);
		int r3=obj.mul(3,5);
		int r4=obj.div(5,1);
		double r5=obj.power(2,2);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}
