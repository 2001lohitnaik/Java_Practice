//Best Example For Use Of Heap Memory

class Student
{
	static String name="Reddy";
	int age=45;
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.age=60;

		System.out.println(s1.name+" "+s1.age);
		System.out.println(s2.name+" "+s2.age);
	}
}