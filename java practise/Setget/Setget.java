import java.lang.*;
public class Setget
{
	private String name;
	private int age;
	private String dob ;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{this.age=age;}
	public int getAge(){return age;}
	public void getDate(String dob)
	{
		this.dob=dob;
	}
	public String getDate(){return dob;}
	public void show()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("DOB:"+dob);
	}
}