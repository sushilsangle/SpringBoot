package thirdset;

public class TestSecond 
{
	int x = 2;
	
	TestSecond(int i)
	{
		x = i;
	}
	public static void main(String args[])
	{
		TestSecond t =new TestSecond(5);
		System.out.println("x = " + t.x);
	}
}

/* O/P is x=5;*/

/*INside constructor x overwrites 5 hence x will become 5 it means we'r just replaceing values.*/
