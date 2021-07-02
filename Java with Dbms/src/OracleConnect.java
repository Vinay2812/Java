import java.sql.*;
public class OracleConnect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","brockvs28");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			con.close();
		}catch(Exception e) {System.out.println(e);}

	}
}

