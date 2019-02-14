package setsecond;

class Base
{
	public void Print()
	{
		System.out.println("Base");
	}
}
class Dervied extends Base
{
	public void Print()
	{
		System.out.println("Derived");
	}
}
public class Main 
{
	public static void DoPrint(Base o)
	{
		o.Print();
	}
	public static void main(String args[])
	{
		Base x = new Base();
		DoPrint(x); //TODO O/P It will print Base because here we called Base(Parent calls only and by using paretn class object we can't call child method but through child we can access all parent class attributes.)
	
		Dervied d = new Dervied();
		DoPrint(d); //TODO this line will print Base / Derived because through child we can access paretn class attributes.
	}
}
