//Method Without Arguments and With Return Value.

class Example7 
{
	public static int m1()
	{
		System.out.println("integer");
		return 10;
	}
	public static double m2()
	{
		System.out.println("double");
		return 10.5;
	}
	public static char m3()
	{
		System.out.println("char");
		return 'A';
	}
	public static String m4()
	{
		System.out.println("String");
		return "abc";
	}
	public static boolean m5()
	{
		System.out.println("boolean");
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(m1());
		System.out.println(m2());
		System.out.println(m3());
		System.out.println(m4());
		System.out.println(m5());
	}
}
