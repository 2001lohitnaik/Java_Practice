class Meth
{
	public void firstMeth()
	{
		int data=10;
		int data1=20;
		System.out.println("Data is"+data+" Data1 is "+data1);
	}
	public void secMeth()
	{
		int data2=10;
		int data3=20;
		System.out.println("Data2 is"+data2+" Data3 is "+data3);
	}

	//Power Of Static Keyword
	public static void fifthMeth()
	{
		int data6=10;
		int data7=20;
		System.out.println("Data6 is"+data6+" Data7 is "+data7);
	}


	public static void main(String args[])
	{
		Meth obj=new Meth();
		obj.firstMeth();
		obj.secMeth();		//Object Needed For Calling Non Static Method
		
		fifthMeth();        //We Can Directly Call The Static Method By Methodname
	}
}