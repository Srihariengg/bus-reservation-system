package project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.Date;

public class Bookingdao {

	public static int getbookedcount(int bus_no, Date date) throws Exception  {
	
	Connection conn=Dbconnection.getConnection();
	String query="select count(name) from booking where id=? and Date=?";
	PreparedStatement pst=conn.prepareStatement(query);
	pst.setInt(1,bus_no);
	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	pst.setDate(2, sqldate);
	ResultSet rs=pst.executeQuery();
	rs.next();
	return rs.getInt(1);
	
	}

	public void addBooking(Booking booking)throws Exception {
		Connection conn=Dbconnection.getConnection();
		String query="insert into booking values(?,?,?)";
		PreparedStatement pst=conn.prepareStatement(query);
		pst.setString(2, booking.passenger_name);
		pst.setInt(1,booking.bus_no);
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		pst.setDate(3, sqldate);
		pst.executeUpdate();
		
	}
}
