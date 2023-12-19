package multiThreading;
import java.util.Scanner;

public class Third_Prog 
{
	static Scanner s=new Scanner(System.in);

	 public static void main(String[] args)
     {
		 //System.out.println("The Total Seats available are: "+Seats);
		 System.out.println("Enter the no of seats");
		 int n=s.nextInt();
		 Third_Pro l=new Third_Pro();
		 new Thread()
		 {
			public void run()
			{
				try
				{
					l.withdraw(n);
				}
				catch(Exception e)
				{
					System.out.println(toString());
				}
			}
			 
		 }.start();
		 new Thread()
		 {
			public void run()
			{
				System.out.println("Enter the no of seats to add in Total Seats");
				int n=s.nextInt();
				try
				{
					l.deposit(n);
				}
				catch(Exception e)
				{
					System.out.println(toString());
				}
			}
			 
		 }.start();
	 }

}
/*
output:-
--------
Enter the no of seats
15
The Total Seats available are: 30
Amount credited
Booking success
Remaining Seats: 15
------------------------------+

Enter the no of seats to add in Total Seats
5
Seats added success
Remaining Seats: 20
---------------------------------------
Enter the no of seats
40
The Total Seats available are: 30
Seats not Available
Enter the no of seats to add in Total Seats
10
Seats added success
Remaining Seats: 40
Amount credited
Booking success
Remaining Seats: 0
*/
