package arraylist;
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;
public class Class1
{ 	static void A1()
	{	
		Scanner s=new Scanner(System.in);
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('A');
		a.add(24.56);
		a.add("Sagar");
		System.out.println(a);
		
		ArrayList<Integer> aa=new ArrayList<Integer>();
		aa.add(12);
		aa.add(50);
		//a1.add("sagar");
		System.out.println(aa);
		System.out.println(aa.size());
		System.out.println(aa.get(0));
		aa.add(0,20);
		System.out.println(aa);
		aa.remove(0);
		aa.remove((Object)100);
		System.out.println("+++++");
		System.out.println(aa.contains(100));
		System.out.println("+++++");
		System.out.println(aa);
		System.out.println("+++++");
		System.out.println(aa.indexOf(12));
		System.out.println("+++++");
		for(int i=0;i<aa.size();i++) 
		{
			System.out.println(aa.get(i)+" ");
		}
		System.out.println("+++++");
		for(int i=a.size()-1;i<=0;i--) 
		{
			System.out.println(aa.get(i)+" ");
		}
		System.out.println("+++++");
		for(Object i:a) 
		{
			System.out.println(i);
		}
		Iterator i=aa.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next()+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		A1();
	}
	
}
