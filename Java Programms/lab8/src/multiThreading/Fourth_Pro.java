package multiThreading;
//BVIDHYASAGAR..AF0320724
public class Fourth_Pro extends Thread
{
	public void run()
    {
		String name=Thread.currentThread().getName();
		System.out.println("Not Synchronized Thread: ");
		for(int i=1;i<=5;i++)
    	{
    		System.out.println(name+" - count: "+i);
    	}
		System.out.println("======================");
    	synchronized (this)
    	{
    		System.out.println("synchronized block");
        	for(int i=1;i<=5;i++)
        	{
        		System.out.println(name+" - count :"+i);
        	}
    	}
    }
    public static void main(String[] args)
    {
    	Fourth_Pro f=new Fourth_Pro();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}
/*
OUTPUT:-
--------
Not Synchronized Thread: 
Not Synchronized Thread: 
Thread2 - count: 1
Thread2 - count: 2
Thread1 - count: 1
Thread1 - count: 2
Thread1 - count: 3
Thread2 - count: 3
Thread1 - count: 4
Thread1 - count: 5
Thread2 - count: 4
Thread2 - count: 5
======================
======================
synchronized block
Thread2 - count :1
Thread2 - count :2
Thread2 - count :3
Thread2 - count :4
Thread2 - count :5
synchronized block
Thread1 - count :1
Thread1 - count :2
Thread1 - count :3
Thread1 - count :4
Thread1 - count :5
*/
