package Five;

public class Second 
{
	public static void gfg(String s)
	{
		System.out.println("String");
	}
	public static void gfg(Object o)
	{
		System.out.println("Obect");
	}
	public static void gfg(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String args[])
	{
		gfg(null);
		//gfg("sushil");
	}
}

/* O/P it will hit CE: gfg(String s) is ambiguous for type of this class.
 * if you pass integer / String value instead of null then it will haply print integer/string values.*/
