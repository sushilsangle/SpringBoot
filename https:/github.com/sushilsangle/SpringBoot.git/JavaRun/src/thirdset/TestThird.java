package thirdset;

class Test1
{
	public Test1(int x)
	{
		System.out.println("Constructor called " + x);
	}
}
public class TestThird 
{
	Test1 t = new Test1(10);
	
	TestThird(int i)
	{
		t = new Test1(i);
	}
	public static void main(String args[])
	{
		TestThird t2 = new TestThird(5);
	}
}


/*O/P-> As per constructor initialization rules first local varibales get chance to print so 
 * so the 
 * Constructor called 10
Constructor called 5

 * */
 