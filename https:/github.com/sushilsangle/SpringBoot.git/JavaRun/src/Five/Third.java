package Five;

public class Third
{
	public static void main(String args[])
	{
		String s1 = "abc";
		String s2 = s1;
		s1  += "d";
		
		System.out.println(s1 + " " + s2 + " " + " " + (s1 == s2));
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		
		System.out.println(sb1 + " " + sb2 +"  " +  (sb1 == sb2));
	}
}
/*OP->
 *abcd abc fase
 *abcd abcd true
 *
 * String is immutable and string buffer is mutable.and here s2 and s1 both pointing to the same string abc.
 * after doing changes like string s1 points to abcd and s2 points to abc, hence false.
 * While in string buffer, both sb1 and sb2 both point to the same object. 
 * Since string buffer are mutable, making changes in one string also make changes to the other string. 
 * So both string still pointing to the same object after making the changes to the object (here sb2).
 *
 * 
 * *
 */