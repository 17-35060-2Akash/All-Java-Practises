import java.lang.*;

public class Start
{
	public static void main(String []args)
	{
		Rectangle r1 = new Rectangle();
		r1.setX(1.5);
		r1.setY(1.2);
		
		System.out.println("R1 x: "+r1.getX());
		System.out.println("R1 y: "+r1.getY());
		System.out.println("R1 Area: "+r1.getArea());
		
		Rectangle r2 = new Rectangle(2.5, 2.3);
		System.out.println("R2 x: "+r2.getX());
		System.out.println("R2 y: "+r2.getY());
		System.out.println("R2 Area: "+r2.getArea());
		
	}
}