import java.sql.*;
import java.util.*;

public class InsertDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter ID : ");
		int id=sc.nextInt();
		System.out.print("Enter Name : "); 
		String name=sc.next();
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		System.out.print("Enter Salary : ");
		int salary=sc.nextInt();
		System.out.print("Enter Desig: ");
		String desig=sc.next();
		
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setInt(3,age);
		stmt.setInt(4, salary);
		stmt.setString(5, desig);
		
		stmt.execute();
		stmt.close();
		con.close();
		System.out.println("Data Inserted Succsfully...!");
		} catch (Exception e) {
			System.err.println(e);
		}	
	}
}