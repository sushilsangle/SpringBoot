package setfour;

class Base
{
	protected void foo()
	{
		
	}
	
}
class Derived extends Base
{
	void foo()
	{
		
	}
}
public class FourOne
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.foo();
	}
}

/*O/P ->
 * foo() is protected in Base and default in Derived and Default access is more restrictive. 
 * when derived class overrides base class function it will give us 
 * CE: Cannot reduce the visibility of the inherited method from Base.
*/