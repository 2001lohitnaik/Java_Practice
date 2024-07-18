public class StrThi
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Lohit");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" Naik"));
		System.out.println(sb.deleteCharAt(5));
		System.out.println(sb.insert(5," "));
	}
}