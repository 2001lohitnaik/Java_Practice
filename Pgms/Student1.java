class Student1
{
	static String name="Reddy";
	int age=45;
	static int weight=30;
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.age=60;

		System.out.println(weight);
		System.out.println(name+" "+s1.age);
		System.out.println(name+" "+s2.age);
	}
}