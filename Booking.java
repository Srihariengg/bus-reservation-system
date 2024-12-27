package project;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	
	int bus_no;
	 Date date;
	 String passenger_name;
	Scanner scan=new Scanner(System.in);
	 Booking(){
		 System.out.println("enter bus_no");
		 bus_no=scan.nextInt();
		 System.out.println("enter passenger_name");
		 passenger_name=scan.next();
		 System.out.println("enter date dd-mm-yyyy");
		 String dateinp=scan.next();
		 SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		 try {
			date=dateformat.parse(dateinp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	 }
	public boolean isAvailable() throws Exception {
		
		Busdao busdao=new Busdao();
		int capacity=busdao.getCapacity(bus_no);
		
		
		int booked=Bookingdao.getbookedcount(bus_no,date);
		
		
		return booked<capacity;
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

