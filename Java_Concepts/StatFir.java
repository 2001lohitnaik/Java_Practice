class StatFir
{
		String brand;
		int price;
		static String name;

		public void display()
		{
			System.out.println("Mobile Details: " +"Brand : " +brand +" : " + " price "+price +" : "+ "name"+ " : "+name);
		}


	public static void main(String args[])
	{
		StatFir mb=new StatFir();
		mb.brand="Redmi";
		mb.price=1500;

		StatFir mb2=new StatFir();
		mb2.brand="Realme";
		mb2.price=1700;

		name="phone";

		mb.display();
		mb2.display();
	}
}