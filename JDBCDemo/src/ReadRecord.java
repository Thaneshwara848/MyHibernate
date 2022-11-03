import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement stmt=con.createStatement();
	ResultSet rs =stmt.executeQuery("select * from emp");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" : "+rs.getString("name")+" : "+rs.getInt(3));
	}
		} catch (Exception e) {
			System.err.println(e);
		}	

	}

}
