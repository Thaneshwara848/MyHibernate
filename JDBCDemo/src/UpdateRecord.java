import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement stmt=con.prepareStatement("update emp set salary= ? where id=?;");
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		int id=sc.nextInt();
	
		System.out.print("Enter Salary : ");
		int salary=sc.nextInt();
		
		stmt.setInt(1, salary);
		stmt.setInt(2, id);
	
		stmt.execute();
		stmt.close();
		con.close();
		System.out.println("Data Updated  Succsfully...!");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
