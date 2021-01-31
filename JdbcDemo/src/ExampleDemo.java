import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/youtube","root","root");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from table1");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " "+rs.getString(2)+ " "+rs.getString(3));
				
				//con.close();
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
