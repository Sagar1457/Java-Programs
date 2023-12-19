package multiThreading;
//BVIDHYASAGAR..AF0320724
public class Third_Pro
{
	int Seats=30;
    synchronized void withdraw(int Select) throws Exception
     {
    	System.out.println("The Total Seats available are: "+Seats);
   	  if(this.Seats<Select) 
   	  {
   		  System.out.println("Seats not Available");
   		System.out.println("------------------------------\n");
   		  wait();
   		  System.out.println("Amount credited");
   		  this.Seats-=Select;
   		  System.out.println("Booking success");
   		  System.out.println("Remaining Seats: "+this.Seats);
   	  } 
   	  else
   	  {
   		  System.out.println("Amount credited");
   		  this.Seats-=Select;
   		  System.out.println("Booking success");
   		  System.out.println("Remaining Seats: "+this.Seats);
   		  System.out.println("------------------------------\n");
   	  }
     }
     synchronized void deposit(int Select)
     {
   	  this.Seats+=Select;
   	  System.out.println("Seats added success");
   	  System.out.println("Remaining Seats: "+this.Seats);  
   	  //notify();
   	  notifyAll();
     }
}
