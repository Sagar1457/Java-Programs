package multiThreading;
//BVIDHYASAGAR..AF0320724
public class Secound_Pro implements Runnable
{
	public void run()
	{
	   System.out.println("Runnable method executed");
	}
	public static void main(String[] args)
	{
		Secound_Pro  t=new Secound_Pro();
		Thread t1=new Thread(t);
		t1.start();
	}
}
/*
output:-
--------
Runnable method executed
*/