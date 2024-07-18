//Methods With Arguments and Return Value

class Example6
{
	public static int m1(int a)
	{
		System.out.println("integer");
		return 10;
	}
	public static double m2(double d)
	{
		System.out.println("double");
		return 10.7;
	}
	public static char m3(char ch)
	{
		System.out.println("char");
		return 'A';
	}
	public static String m4(String s)
	{
		System.out.println("String");
		return "abc";
	}
	public static boolean m5(boolean b)
	{
		System.out.println("boolean");
		return true;
	}
	public static void main(String[] args) 
	{
		System.out.println(m1(10));
		System.out.println(m2(10.5));
		System.out.println(m3('B'));
		System.out.println(m4("ABCD"));
		System.out.println(m5(false));
	}
}
