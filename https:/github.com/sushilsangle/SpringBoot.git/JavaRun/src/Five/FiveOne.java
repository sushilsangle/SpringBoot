package Five;


public class FiveOne 
{

	public static void gfg(String s)
	{
		System.out.println("String");
	}
	public static void gfg(Object o)
	{
		System.out.println("Object");
	}
	public static void main(String args[])
	{
		gfg(null);
	}
}


/* O/P itwill print String*/
/*In method overloading most specific method will get first change to execute compile time like java.lang.String.
 * hence first String get change to execute */
 