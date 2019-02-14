package setone;

class Test 
{
	protected int x,y;
	
}

public class Main 
{
	public static void main(String args[])
	{
			Test t = new Test();
			System.out.println(t.x + " " + t.y);
	}
}


/*
 * Out put is  0 0 
 * IN java protected variable are accessible from anywhere within same class and constructor
 * Initialize default values of both variable is 0 0 
 *  * */
