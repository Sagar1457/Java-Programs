package jdbc;
//BVIDHYASAGAR..AF0320724
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Crud_operations 
{
	void insertData() throws SQLException 
	{
		String sql="insert into curd_oprations(name,category,price,brand,rating) values(?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(sql);
		System.out.println("Enter name");
		ps.setString(1,s.next());
		System.out.println("Enter price");
		ps.setInt(3,s.nextInt());
		System.out.println("Enter brand");
		ps.setString(4,s.next());
		System.out.println("Enter rating");
		ps.setFloat(5,s.nextFloat());
		System.out.println("Enter category");
	    ps.setString(2,s.next());
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
	void selectData1000() throws SQLException
	{
		String sql="select * from curd_oprations where price<=1000";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("Name = "+rs.getString("name"));
			System.out.println("Category = "+rs.getString("category"));
			System.out.println("Price = "+rs.getInt("price"));
			System.out.println("Brand = "+rs.getString("brand"));
			System.out.println("Rating = "+rs.getFloat("rating")+"\n");
		}
	}
	void selectData4() throws SQLException
	{
		String sql="select * from curd_oprations where rating>4.5";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("Name = "+rs.getString("name"));
			System.out.println("Category = "+rs.getString("category"));
			System.out.println("Price = "+rs.getInt("price"));
			System.out.println("Brand = "+rs.getString("brand"));
			System.out.println("Rating = "+rs.getFloat("rating")+"\n");
		}
	}
	void updateData() throws SQLException
	{
		String sql="update curd_oprations set price=15000 where no="+9;
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
		String sql="delete from curd_oprations where price<100";
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
	Scanner s=new Scanner(System.in);
	static Connection con=null;
	public static void main(String[] args) 
	{
		Crud_operations cp=new Crud_operations();
		System.out.print("Database Management");
		System.out.print("===================\n");
		System.out.println("1.Add Data to Database");
		System.out.println("2.To See your Data whose price<=100 in Database");
		System.out.println("3.To See your Data whose rating>4.5 in Database");
		System.out.println("4.To update price of SmartWatch From Database");
		System.out.println("5.To Delete products whose price<100 Data From Database\n");
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sagar";
		String user="root";
		String password="Sagar@1457#";
		con=DriverManager.getConnection(url, user, password);
		System.out.print("Enter your choice: ");
		int choice=cp.s.nextInt();
		switch(choice)
		{
		case 1:
			cp.insertData();
			break;
		case 2:
			cp.selectData1000();
			break;
		case 4:
			cp.updateData();
			break;
		case 5:
			cp.deleteData();
			break;
		case 3:
			cp.selectData4();
			break;
		default:
			System.out.println("Invailid choice");
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
/*
output:-
=========
Database Management===================
1.Add Data to Database
2.To See your Data whose price<=100 in Database
3.To See your Data whose rating>4.5 in Database
4.To update price of SmartWatch From Database
5.To Delete products whose price<100 Data From Database

Enter your choice: 
1.
mysql> use sAGAR
Database changed
mysql> DESC CURD_OPRATIONS
    -> ;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| no       | int         | NO   | PRI | NULL    | auto_increment |
| name     | varchar(30) | YES  |     | NULL    |                |
| category | varchar(30) | YES  |     | NULL    |                |
| price    | int         | YES  |     | NULL    |                |
| brand    | varchar(30) | YES  |     | NULL    |                |
| rating   | float       | YES  |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> select * from curd_oprations;
+----+-----------------+----------+-------+-----------+--------+
| no | name            | category | price | brand     | rating |
+----+-----------------+----------+-------+-----------+--------+
|  1 | Blue_Shirt      | Clothing |   750 | Denim     |    3.8 |
|  2 | Blue_Jeans      | Clothing |   800 | Puma      |    3.6 |
|  3 | Blue_Jeans      | Clothing |   750 | Denim     |    4.5 |
|  4 | Blue_Shirt      | Clothing |  1000 | Puma      |    4.3 |
|  5 | Chocolate_Cake  | Food     |    25 | Britannia |    3.7 |
|  6 | Strawberry_Cake | Food     |    60 | Cadbury   |    4.1 |
|  7 | Chocolate_Cake  | Food     |    60 | Cadbury   |    2.5 |
|  8 | Strawberry_Cake | Food     |    10 | Britannia |    4.6 |
|  9 | Smart_Watch     | Gadgets  | 17000 | Apple     |    4.9 |
| 10 | Smart_Cam       | Gadgets  |  2600 | Realme    |    4.7 |
| 11 | Smart_TV        | Gadgets  | 40000 | Sony      |      4 |
| 12 | Smart_Band      | Gadgets  |  3000 | Realme    |    4.6 |
| 13 | Raw_Cashew      | Food     |   370 | Absa      |    3.9 |
| 14 | Cashew_Nuts     | Food     |   550 | Upcrop    |    4.3 |
+----+-----------------+----------+-------+-----------+--------+
14 rows in set (0.00 sec)

mysql>
-------------------------------------------------------------------
2.
Database Management===================
1.Add Data to Database
2.To See your Data whose price<=100 in Database
3.To See your Data whose rating>4.5 in Database
4.To update price of SmartWatch From Database
5.To Delete products whose price<100 Data From Database

Enter your choice: 2
Name = Blue_Shirt
Category = Clothing
Price = 750
Brand = Denim
Rating = 3.8

Name = Blue_Jeans
Category = Clothing
Price = 800
Brand = Puma
Rating = 3.6

Name = Blue_Jeans
Category = Clothing
Price = 750
Brand = Denim
Rating = 4.5

Name = Blue_Shirt
Category = Clothing
Price = 1000
Brand = Puma
Rating = 4.3

Name = Chocolate_Cake
Category = Food
Price = 25
Brand = Britannia
Rating = 3.7

Name = Strawberry_Cake
Category = Food
Price = 60
Brand = Cadbury
Rating = 4.1

Name = Chocolate_Cake
Category = Food
Price = 60
Brand = Cadbury
Rating = 2.5

Name = Strawberry_Cake
Category = Food
Price = 10
Brand = Britannia
Rating = 4.6

Name = Raw_Cashew
Category = Food
Price = 370
Brand = Absa
Rating = 3.9

Name = Cashew_Nuts
Category = Food
Price = 550
Brand = Upcrop
Rating = 4.3
------------------------------------------------------------
3.
Database Management===================
1.Add Data to Database
2.To See your Data whose price<=100 in Database
3.To See your Data whose rating>4.5 in Database
4.To update price of SmartWatch From Database
5.To Delete products whose price<100 Data From Database

Enter your choice: 3
Name = Strawberry_Cake
Category = Food
Price = 10
Brand = Britannia
Rating = 4.6

Name = Smart_Watch
Category = Gadgets
Price = 17000
Brand = Apple
Rating = 4.9

Name = Smart_Cam
Category = Gadgets
Price = 2600
Brand = Realme
Rating = 4.7

Name = Smart_Band
Category = Gadgets
Price = 3000
Brand = Realme
Rating = 4.6
----------------------------------------------------------
4.
Database Management===================
1.Add Data to Database
2.To See your Data whose price<=100 in Database
3.To See your Data whose rating>4.5 in Database
4.To update price of SmartWatch From Database
5.To Delete products whose price<100 Data From Database

Enter your choice: 4
updated successfully
mysql> select * from curd_oprations;
+----+-----------------+----------+-------+-----------+--------+
| no | name            | category | price | brand     | rating |
+----+-----------------+----------+-------+-----------+--------+
|  1 | Blue_Shirt      | Clothing |   750 | Denim     |    3.8 |
|  2 | Blue_Jeans      | Clothing |   800 | Puma      |    3.6 |
|  3 | Blue_Jeans      | Clothing |   750 | Denim     |    4.5 |
|  4 | Blue_Shirt      | Clothing |  1000 | Puma      |    4.3 |
|  5 | Chocolate_Cake  | Food     |    25 | Britannia |    3.7 |
|  6 | Strawberry_Cake | Food     |    60 | Cadbury   |    4.1 |
|  7 | Chocolate_Cake  | Food     |    60 | Cadbury   |    2.5 |
|  8 | Strawberry_Cake | Food     |    10 | Britannia |    4.6 |
|  9 | Smart_Watch     | Gadgets  | 17000 | Apple     |    4.9 |
| 10 | Smart_Cam       | Gadgets  |  2600 | Realme    |    4.7 |
| 11 | Smart_TV        | Gadgets  | 40000 | Sony      |      4 |
| 12 | Smart_Band      | Gadgets  |  3000 | Realme    |    4.6 |
| 13 | Raw_Cashew      | Food     |   370 | Absa      |    3.9 |
| 14 | Cashew_Nuts     | Food     |   550 | Upcrop    |    4.3 |
+----+-----------------+----------+-------+-----------+--------+
14 rows in set (0.00 sec)

mysql> select * from curd_oprations;
+----+-----------------+----------+-------+-----------+--------+
| no | name            | category | price | brand     | rating |
+----+-----------------+----------+-------+-----------+--------+
|  1 | Blue_Shirt      | Clothing |   750 | Denim     |    3.8 |
|  2 | Blue_Jeans      | Clothing |   800 | Puma      |    3.6 |
|  3 | Blue_Jeans      | Clothing |   750 | Denim     |    4.5 |
|  4 | Blue_Shirt      | Clothing |  1000 | Puma      |    4.3 |
|  5 | Chocolate_Cake  | Food     |    25 | Britannia |    3.7 |
|  6 | Strawberry_Cake | Food     |    60 | Cadbury   |    4.1 |
|  7 | Chocolate_Cake  | Food     |    60 | Cadbury   |    2.5 |
|  8 | Strawberry_Cake | Food     |    10 | Britannia |    4.6 |
|  9 | Smart_Watch     | Gadgets  | 15000 | Apple     |    4.9 |
| 10 | Smart_Cam       | Gadgets  |  2600 | Realme    |    4.7 |
| 11 | Smart_TV        | Gadgets  | 40000 | Sony      |      4 |
| 12 | Smart_Band      | Gadgets  |  3000 | Realme    |    4.6 |
| 13 | Raw_Cashew      | Food     |   370 | Absa      |    3.9 |
| 14 | Cashew_Nuts     | Food     |   550 | Upcrop    |    4.3 |
+----+-----------------+----------+-------+-----------+--------+
14 rows in set (0.00 sec)
-----------------------------------------------------------------
5.
Database Management===================
1.Add Data to Database
2.To See your Data whose price<=100 in Database
3.To See your Data whose rating>4.5 in Database
4.To update price of SmartWatch From Database
5.To Delete products whose price<100 Data From Database

Enter your choice: 5
deleted successfully
mysql> select * from curd_oprations;
+----+-----------------+----------+-------+-----------+--------+
| no | name            | category | price | brand     | rating |
+----+-----------------+----------+-------+-----------+--------+
|  1 | Blue_Shirt      | Clothing |   750 | Denim     |    3.8 |
|  2 | Blue_Jeans      | Clothing |   800 | Puma      |    3.6 |
|  3 | Blue_Jeans      | Clothing |   750 | Denim     |    4.5 |
|  4 | Blue_Shirt      | Clothing |  1000 | Puma      |    4.3 |
|  5 | Chocolate_Cake  | Food     |    25 | Britannia |    3.7 |
|  6 | Strawberry_Cake | Food     |    60 | Cadbury   |    4.1 |
|  7 | Chocolate_Cake  | Food     |    60 | Cadbury   |    2.5 |
|  8 | Strawberry_Cake | Food     |    10 | Britannia |    4.6 |
|  9 | Smart_Watch     | Gadgets  | 15000 | Apple     |    4.9 |
| 10 | Smart_Cam       | Gadgets  |  2600 | Realme    |    4.7 |
| 11 | Smart_TV        | Gadgets  | 40000 | Sony      |      4 |
| 12 | Smart_Band      | Gadgets  |  3000 | Realme    |    4.6 |
| 13 | Raw_Cashew      | Food     |   370 | Absa      |    3.9 |
| 14 | Cashew_Nuts     | Food     |   550 | Upcrop    |    4.3 |
+----+-----------------+----------+-------+-----------+--------+
14 rows in set (0.00 sec)

mysql> select * from curd_oprations;
+----+-------------+----------+-------+--------+--------+
| no | name        | category | price | brand  | rating |
+----+-------------+----------+-------+--------+--------+
|  1 | Blue_Shirt  | Clothing |   750 | Denim  |    3.8 |
|  2 | Blue_Jeans  | Clothing |   800 | Puma   |    3.6 |
|  3 | Blue_Jeans  | Clothing |   750 | Denim  |    4.5 |
|  4 | Blue_Shirt  | Clothing |  1000 | Puma   |    4.3 |
|  9 | Smart_Watch | Gadgets  | 15000 | Apple  |    4.9 |
| 10 | Smart_Cam   | Gadgets  |  2600 | Realme |    4.7 |
| 11 | Smart_TV    | Gadgets  | 40000 | Sony   |      4 |
| 12 | Smart_Band  | Gadgets  |  3000 | Realme |    4.6 |
| 13 | Raw_Cashew  | Food     |   370 | Absa   |    3.9 |
| 14 | Cashew_Nuts | Food     |   550 | Upcrop |    4.3 |
+----+-------------+----------+-------+--------+--------+
10 rows in set (0.00 sec)
----------------------------------------------------------
*/