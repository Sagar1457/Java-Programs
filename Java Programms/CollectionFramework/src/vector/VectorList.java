package vector;

import java.util.Vector;
import java.util.Iterator;
//import java.util.Enumeration;
public class VectorList 
{
	static void A1()
	{
		Vector vl=new Vector();
		vl.add(10);
		vl.add('A');
		vl.add(25.64);
		vl.add("Sagar");
		System.out.println(vl);
		
		Vector<Integer> a1=new Vector<Integer>();
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
		for(int i=vl.size()-1;i<=0;i--) 
		{
			System.out.println(a1.get(i)+" ");
		}
		for(Integer i:a1) 
		{
			System.out.print(i);
		}
		Iterator i=a1.iterator();
		while(i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
		//Enumeration 
	}
	public static void main(String[] args) 
	{
		A1();
	}
}
