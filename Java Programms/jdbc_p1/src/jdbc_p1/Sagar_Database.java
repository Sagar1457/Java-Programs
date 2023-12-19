package jdbc_p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Sagar_Database 
{
	static Connection con=null;
	void Add_data() throws SQLException 
	{
		// String sql="insert into student(name,perc,city) values('Arjun',75.67,'hyd')";
		String sql="insert into sagar(name,city,amount) values(?,?,?)";
		PreparedStatement ps= con.prepareStatement(sql);
		System.out.println("Enter name");
		ps.setString(1, s.next());
		System.out.println("Enter city");
	    ps.setString(2, s.next());
		System.out.println("Enter amount");
		ps.setInt(3,s.nextInt());
		int rows=ps.executeUpdate();
		if(rows>0)
		{
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("data not inserted");
		}
		
	}
	void See_data() throws SQLException 
	{
		//System.out.println("Enter name of the student");
		//String nam=sc.next();
		String sql="select * from sagar";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("Name = "+rs.getString("name"));
			System.out.println("City = "+rs.getString("city"));
			System.out.println("Amount = "+rs.getInt("amount")+"\n");
		}
	}
	void Search_data() 
	{
		
	}
	void Modify_data() throws SQLException 
	{
		/*System.out.print("Enter the idno: ");
		int x=s.nextInt();
		System.out.print("Enter the name: ");
		String up=s.next();*/
		String sql="update sagar set name=uhitha where idno="+2;
	    PreparedStatement ps=con.prepareStatement(sql);
	    int rows=ps.executeUpdate();
	    if(rows>0)
	    {
	    	System.out.println("updated successfully");
	    }
	    else
	    {
	    	System.out.println("not updated");
	    }
	}
	void Delete_data() 
	{
		
	}
	Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Sagar_Database sb=new Sagar_Database();
		System.out.print("Database Management");
		System.out.print("===================\n");
		System.out.println("1.Add Data to Database");
		System.out.println("2.To See your Data in Database");
		System.out.println("3.To Modify the Data From Database");
		System.out.println("4.To Delete Data From Database");
		System.out.println("5.To Search Data From Database\n");
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Sagar";
			String user="root";
			String password="Sagar@1457#";
			con=DriverManager.getConnection(url, user, password);
			System.out.print("select  your choice: ");
			int choice=sb.s.nextInt();	
			switch(choice) 
			{
				case(1):
					sb.Add_data();
					break;
				case(2):
					sb.See_data();
					break;
				case(3):
					sb.Modify_data();
					break;
				case(4):
					sb.Delete_data();
					break;
				case(5):
					sb.Search_data();
					break;
				default:
					System.out.println("invailed choice");
					break;
			}
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
