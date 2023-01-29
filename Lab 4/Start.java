import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
	System.out.println(".....COORDINATE_PART::.....");
	System.out.println("First Object for Coordinate:-");
System.out.println("--------------------------------------");	
	Coordinate C1= new Coordinate();
	C1.setLongitude(11.1);
	C1.setLatitude(11.2);
	System.out.println("Longitude:"+C1.getLongitude());
	System.out.println("Latitude:"+C1.getLatitude());
	System.out.println("Second Object for Coordinate:-");
System.out.println("--------------------------------------");

Coordinate C2= new Coordinate();
	C2.setLongitude(11.3);
	C2.setLatitude(11.4);
	System.out.println("Longitude:"+C2.getLongitude());
	System.out.println("Latitude:"+C2.getLatitude());

System.out.println("--------------------------ENDING_COORDINATE---------------------------------");
    System.out.println(".....SCHEDULE_PART:.....");	
  
	System.out.println("First_Object_For_Schedule:");
System.out.println("--------------------------------------");	
	Schedule S1=new Schedule();
	S1.setHour(14);
	S1.setMinute(59);
	System.out.println("Hour"+S1.getHour());
	System.out.println("Minute"+S1.getMinute());
	System.out.println("Second_Object_For_Schedule:");
System.out.println("--------------------------------------");	
	
	Schedule S2=new Schedule();
	S2.setHour(15);
	S2.setMinute(59);
	System.out.println("Hour:"+S2.getHour());
	System.out.println("Minute:"+S2.getMinute()); 
	System.out.println("--------------------------SCHEDULE_ENDING-----------------------------");  	
	
	System.out.println(".....AIRPORT_PART:.....");
	
	System.out.println("First_Object_For_Airport:");
System.out.println("--------------------------------------");	
	
	Airport A1=new  Airport();
	A1.setName("BB International");
	A1.setLocation(C1);
	System.out.println("Name"+A1.getName());
	System.out.println("Longitude"+A1.getLocation().getLongitude());
	System.out.println("Latitude"+A1.getLocation().getLatitude());
	
	System.out.println("Second_Object_for_Airport");
System.out.println("--------------------------------------");	
	
	Airport A2 = new  Airport();
	A2.setName("CC International");
	A2.setLocation(C2);
	System.out.println("Name"+A2.getName());
	System.out.println("Longitude"+A2.getLocation().getLongitude());
	System.out.println("Latitude"+A2.getLocation().getLatitude());
	
	System.out.println("--------------------------AIRPORT_ENDING------------------------------");
	
System.out.println(".....FLIGHT_PART:.....");
	Flight F1  = new Flight();

System.out.println("-FIRST_OBJECT:-");
System.out.println("--------------------------------------");

 
	
	F1.setFlightId("BDAIR1");
	F1.setCapacity(800);
	F1.setDepartureFrom(A1);
	F1.setDepartureTime(S1);
	F1.setFlyingTo(A1);
	F1.setArrivalTime(S1);
	System.out.println("Flight ID:"+F1.getFlightId());
	System.out.println("Capacity:"+F1.getCapacity());
	System.out.println("Departure From:"); 
	System.out.println("Name:"+F1.getDepartureFrom().getName());
	System.out.println("Longitude:"+F1.getDepartureFrom().getLocation().getLongitude());
	System.out.println("Hour:"+F1.getDepartureTime().getHour());
	System.out.println("Minute:"+F1.getDepartureTime().getMinute());
	System.out.println("Flyingto:");
	System.out.println("Name:"+F1.getFlyingTo().getName());
	System.out.println("Longitude:"+F1.getFlyingTo().getLocation().getLongitude());
	System.out.println("Longitude:"+F1.getFlyingTo().getLocation().getLatitude());
	System.out.println("Arrival Time:");
	System.out.println("Hour:"+F1. getArrivalTime().getHour());
	System.out.println("Minute:"+F1. getArrivalTime().getMinute());

System.out.println("-SECOND_OBJECT-"); 	
System.out.println("--------------------------------------");


	F1.setFlightId("BDAIR2");
	F1.setCapacity(750);
	F1.setDepartureFrom(A2);
	F1.setDepartureTime(S2);
	F1.setFlyingTo(A2);
	F1.setArrivalTime(S2);
	System.out.println("Flight ID:"+F1.getFlightId());
	System.out.println("Capacity:"+F1.getCapacity());
	System.out.println("Departure From:"); 
	System.out.println("Name:"+F1.getDepartureFrom().getName());
	System.out.println("Longitude:"+F1.getDepartureFrom().getLocation().getLongitude());
	System.out.println("Latitude:"+F1.getDepartureFrom().getLocation().getLatitude());
	System.out.println("Departure Time:");
	System.out.println("Hour:"+F1.getDepartureTime().getHour());
	System.out.println("Minute:"+F1.getDepartureTime().getMinute());
	System.out.println("Flyingto:");
	System.out.println("Name:"+F1.getFlyingTo().getName());
	System.out.println("Longitude:"+F1.getFlyingTo().getLocation().getLongitude());
	System.out.println("Longitude:"+F1.getFlyingTo().getLocation().getLatitude());
	System.out.println("Arrival Time:");
	System.out.println("Hour:"+F1.getArrivalTime().getHour());
	System.out.println("Minute:"+F1.getArrivalTime().getMinute());
	
	System.out.println("TIME::"+F1.getArrivalTime().getHour());:+F1.getArrivalTime().getMinute());
	
	
	
	}
}