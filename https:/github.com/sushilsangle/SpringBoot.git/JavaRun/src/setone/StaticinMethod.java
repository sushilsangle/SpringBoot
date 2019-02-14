package setone;

public class StaticinMethod 
{
	public static void main(String args[])
	{
		System.out.println(fun());
	}
	static int fun()
	{
		static int x=0;
		return ++x;
	}
}


/* O/P
 * Inside static methods static varibales are not allowed.
 *
*/