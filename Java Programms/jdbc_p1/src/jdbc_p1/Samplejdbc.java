package jdbc_p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
public class Samplejdbc 
{
	static Connection con=null;
	Scanner sc=new Scanner(System.in);
	void insertData() throws SQLException
	{
		// String sql="insert into student(name,perc,city) values('Arjun',75.67,'hyd')";
		String sql="insert into studentr(name,perc,city) values(?,?,?)";
		PreparedStatement ps= con.prepareStatement(sql);
		System.out.println("Enter name");
		ps.setString(1, sc.next());
		System.out.println("Enter perc");
		ps.setFloat(2, sc.nextFloat());
		System.out.println("Enter city");
		ps.setString(3,sc.next());
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
	void selectData() throws SQLException 
	{
		//System.out.println("Enter name of the student");
		//String nam=sc.next();
		String sql="select * from studentr";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getFloat("perc"));
			System.out.println(rs.getString("city"));
		}
				
		
	}
	void updateData() throws SQLException
	{
		String sql="update studentr set name='Sagar' where idno="+2;
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
	void deleteData() throws SQLException
	{
		String sql="delete from studentr where idno="+4;
	    PreparedStatement ps=con.prepareStatement(sql);
	    int rows=ps.executeUpdate();
	    if(rows>0)
	    {
	    	System.out.println("deleted successfully");
	    }
	    else
	    {
	    	System.out.println("not deleted");
	    }
	}
	public static void main(String[] args)
	{
		Samplejdbc sd=new Samplejdbc();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Sagar";
		String user="root";
		String password="Sagar@1457#";
		con=DriverManager.getConnection(url, user, password);
		int choice=sd.sc.nextInt();
		switch(choice)
		{
		case 1:
			sd.insertData();
			break;
		case 2:
			sd.selectData();
			break;
		case 3:
			sd.updateData();
			break;
		case 4:
			sd.deleteData();
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
