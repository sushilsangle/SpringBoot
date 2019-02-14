package setone;

public class Third 
{
	public static void main(String args[])
	{
		System.out.println(fun());		
	}
	int fun()
	{
		return 20;
	}
}
/*O/P
 * 
 * fun() is non static and in java Non static methods cannot be called. If you do changes like 
 * static int fun() then it will execute fine..
 * 
 * */
 