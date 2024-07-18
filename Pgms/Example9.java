// Method without arguments and without return value.
class Example9
{
	public static void m1()
	{
	int a=10;
	int b=20;
	System.out.println(a+b);
	}
	public static void m2()
	{
		double c=23.5;
		double d=37.7;
		System.out.println(c+d);
	}
	public static void m3()
	{
		int a=10;
		char ch='a';
		System.out.println(a+ch);
	}
	public static void m4()
	{
		char ch='a';
		String s="bcd";
		System.out.println(ch+s);
	}
	public static void m5()
	{
		boolean b=true;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		m1();
		m2();
		m3();
		m4();
		m5();
	}
}