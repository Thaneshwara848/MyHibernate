import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement stmt=con.prepareStatement("delete from emp where id=?;");
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		int id=sc.nextInt();

		stmt.setInt(1,id);
	
		stmt.execute();
		stmt.close();
		con.close();
		System.out.println("Data Deleted   Succsfully...!");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}

			

