class Dimension
{
	double width;
	double height;
	double depth;
	Dimension(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	Dimension()
	{
		width=height=depth=0;
	}
	Dimension(double len)
	{
		width=height=depth=len;
	}
	Dimension(double len,double len1)
	{
		this.width=len;
		this.height=len1;
	}
	double volume()
	{
		return width*height*depth;
	}
}
public class Box
{
	public static void main(String args[])
	{
		Dimension obj1=new Dimension(2,3,4);
		Dimension obj2=new Dimension();
		Dimension obj3=new Dimension(5);
		Dimension obj4=new Dimension(4,5);
		double vol;
		vol=obj1.volume();
		System.out.println("Volume Of Box1 is " +vol);
		vol=obj2.volume();
		System.out.println("Volume Of Box2 is " +vol);
		vol=obj3.volume();
		System.out.println("Volume Of Box3 is " +vol);
		vol=obj4.volume();
		System.out.println("Volume Of Box4 is " +vol);
	}
}
