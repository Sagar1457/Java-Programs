package hashset12;

import java.util.LinkedHashSet;
//import java.util.Iterator;

public class LinkedHash 
{
	static void H() 
	{
		LinkedHashSet<Object> hs=new LinkedHashSet<Object>();
		hs.add(10);
		hs.add('A');
		hs.add(24.56);
		hs.add("Sagar");
		System.out.println(hs);
		
		/*Iterator i=hs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next()+" ");
		}*/
	}
	public static void main(String[] args) 
	{
		H();
	}

}
