package linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
public class Linkedlist 
{
	static void A1()
	{
		LinkedList  ll=new LinkedList();
		ll.add(10);  //adddofpervious,data,addofnextdata
		ll.add('A');
		ll.add(24.56);
		ll.add("Sagar");
		System.out.println(ll);
		
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(12);
		a1.add(50);
		//a1.add("sagar");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		a1.add(1, 100);
		System.out.println(a1);
		a1.remove(0);
		a1.remove((Object)100);
		System.out.println(a1.contains(50));
		System.out.println(a1);
		System.out.println(a1.indexOf(12));
		
		for(int i=0;i<a1.size();i++) 
		{
			System.out.println(a1.get(i)+" ");
		}
		for(int i=a1.size()-1;i<=0;i--) 
		{
			System.out.println(a1.get(i)+" ");
		}
		for(Integer i:a1) 
		{
			System.out.print(i);
		}
		/*ListIterator li=ll.listIterator();
		while(li.hasNext()) 
		{
			System.out.print(li.next()+" ");
		}
		
		while(li.hasPrevious())
		{
			System.out.print(li.hasPrevious()+" ");
			
		}*/
		//Enumeration 
	}
	public static void main(String[] args) 
	{
		A1();
	}
}
