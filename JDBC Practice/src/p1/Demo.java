package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	
	public static void main(String[] args) {
		
	int id =101;
	String name="raj";
	
	String s= "insert into student values("+id+",'"+name+"')";
	System.out.println(s);
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Loaded.");
			
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
	
	
	String qr = "Insert into login values('mohd','umar','umar@gmail.com','70852')";
	Statement st = con.createStatement();
	
	
	int i = st.executeUpdate(qr);
	System.out.println(i+" added Successfully");
	
	
	
	con.close();			
	System.out.println("Connection Closed.");
	
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	
		
	}
	
	
}
