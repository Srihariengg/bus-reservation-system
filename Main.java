package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking_demo {

	public static void main(String[] args) {
		try {
		
		Busdao busdao=new Busdao();
		busdao.display_businfo();
		
		int user_op=1;
		Scanner scan=new Scanner(System.in);
		
		
		
		while(user_op==1) {
			System.out.println("enter 1 to book or enter 2 to exit");
			user_op=scan.nextInt();
			if(user_op==1)
			{
				Booking booking=new Booking();
				if(booking.isAvailable())
				{
					Bookingdao bookingdao=new Bookingdao();
					bookingdao.addBooking(booking);
					System.out.println("booking is confired");
				}
				else
				{
					System.out.println("sorry, bus is full. Try another one or date");
				}
			}
		
		}
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
