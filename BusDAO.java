package project;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

import com.mysql.jdbc.Statement; 
public class Busdao {

	public void display_businfo() throws Exception{
		Connection conn=Dbconnection.getConnection();
		String query="select * from home";
		Statement st=(Statement) conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus_no "+ rs.getInt(1));
			if(rs.getInt(4)==0)
			{
				System.out.println("AC:NO");
			}
			else
			{
				System.out.println("AC:YES");
			}
			System.out.println("capacity: "+ rs.getInt(3));
			
		}
		System.out.println("--------------------");
		
		
	}

	public int getCapacity(int id) throws Exception {
		String query="select capacity from home where id="+id;
		Connection conn =Dbconnection.getConnection();
		Statement st=(Statement) conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

	
}
