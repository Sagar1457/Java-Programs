/*
1.Write a Java Program to create a Thread  

(a)By extending Thread class

2.Write a Java Program to create a Thread  

(a) implementing Runnable Interface

3. Write a Multithreaded Java Program using wait(),notify(),notifyAll()

  methods

4. Write a Java Program to perform Synchronization by making a method/block

  as synchronized
 */
package multiThreading;
//BVIDHYASAGAR..AF0320724
public class First_Pro extends Thread
{
	public void run()
    {
   	 System.out.println("Thread method executed"); 
    }
    public static void main(String[] args) 
    {
    	First_Pro r=new First_Pro();
		Thread t=new Thread(r);
		t.start();
	 }
}
/*
output:-
Thread method executed
*/
