package setfour;

class Complex
{
	private double re,im;
	public String toString()
	{
		return "(" + re + " + " + im + "i)";
	}
	Complex(Complex c)
	{
		re = c.re;
		im = c.im;
	}
}
public class FourSecond 
{
	public static void main(String ags[])
	{
		Complex c1 = new Complex(); //we have define parameterized constructor and here we are not passing any variable
									// hence we will get CE: java.lang.Error: Unresolved compilation problem: The constructor Complex() is undefined
		Complex c2 = new Complex(c1);
		System.out.println(c2);
		
	}
}
