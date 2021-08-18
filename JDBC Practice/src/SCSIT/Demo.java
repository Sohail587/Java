package SCSIT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	
	
	public void addData() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Roll no : ");
		int roll = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter Subject : ");
		String subject = sc.nextLine();
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");  // Step -1 ) Load the driver Class
			System.out.println("Class Loaded");
			
			// Step - 2 ) Create the Connection
			
	Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice" , "root" , "1234");
			System.out.println("Connection established");  
			
			//Write the query
			
		//	String qr = "insert into sample values(1,'ashir','Java');";
			
			String qr = "insert into sample(roll,name) values(?,?);";
			
			// Create the object of Statement/PreparedStatement
			
		//	Statement st = con.createStatement();
		//	int i = st.executeUpdate(qr);
			
		PreparedStatement pst = con.prepareStatement(qr);
		pst.setInt(1, roll);
		pst.setString(2,name);
//		pst.setString(3, subject);
		
		
        int i = pst.executeUpdate();	
		
        if(i>0) {
			
			System.out.println(i+ " Row Added");
        }else {
			System.out.println(" no Row Added");

        }
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		d.addData();
		
		
	}

}
