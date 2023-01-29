import java.lang.*;
public class StringDemo
{
	public static void main(String []args)
	{
		String s1 = "Hello Java";
		String s2 = new String();
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		String s5 = "Hello";
		String s6 = "Hello";
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s2.isEmpty());
		System.out.println(s2.length());
		
		System.out.println(s1.charAt(2));
		
		if(s6 == s5)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		if(s6.equals(s5))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		String s7 = s1.concat(s3);
		System.out.println(s7);
		System.out.println(s1);
		System.out.println(s3);
		
		String s8 = s1.substring(2,7);
		System.out.println(s8);
		System.out.println(s1);
		
		
	
	}
}




