import java.lang.*;

public class Arraydemo
{
	public static void main(String[] args)
	{
		int[] name=new int[10];
		int[] call;
		call=new int[10];
		name[0]=10;
		name[1]=11;
		name[2]=12;
		name[3]=13;
		System.out.println("name 1:"+name[0]);
		System.out.println("name 2:"+name[1]);

		System.out.println("name 3:"+name[2]);

		System.out.println("name 4:"+name[3]);

		System.out.println("name 5:"+name[4]);
		System.out.println("call 1:"+call[0]);
		int len=name.length;
		System.out.println("name array's length:"+len);

	}
}