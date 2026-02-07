package jdbctask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
      
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String username = "root";
		String password = "";
		Integer status = 0;
		Connection con = null;
		try {
		con = DriverManager.getConnection(url, username, password);
		System.out.println("DB Connected");
		PreparedStatement stmt = con.prepareStatement("INSERT INTO emp(empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)");
		
		//Insert first record
		stmt.setInt(1, 101);
		stmt.setString(2, "Jenny");
		stmt.setInt(3, 25); 
		stmt.setInt(4, 10000); 
		status = stmt.executeUpdate();

		// Insert second record 
		 stmt.setInt(1, 102); 
		 stmt.setString(2, "Jacky");
		 stmt.setInt(3, 30);
		 stmt.setInt(4, 20000); 
		 status = stmt.executeUpdate();
		 
		 // Insert third record 
		 stmt.setInt(1, 103);
		 stmt.setString(2, "Joe"); 
		 stmt.setInt(3, 20); 
		 stmt.setInt(4, 40000); 
		 status = stmt.executeUpdate();
		 
		 // Insert fourth record 
		 stmt.setInt(1, 104); 
		 stmt.setString(2, "John"); 
		 stmt.setInt(3, 40); 
		 stmt.setInt(4, 80000); 
		 status = stmt.executeUpdate();
		 
		 // Insert fifth record
		 stmt.setInt(1, 105); 
		 stmt.setString(2, "Shameer"); 
		 stmt.setInt(3, 25); 
		 stmt.setInt(4, 90000); 
		 status = stmt.executeUpdate();
				 
	    System.out.println("Data inserted successfully!"); 
		con.close();
		
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			con.close();
			System.out.println("status = "+status);
		}
	}
	
}
