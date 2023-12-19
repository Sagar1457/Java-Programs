package collectionFrame;
//BVIDHYASAGAR..AF0320724
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class CollectionFramework4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Banana");
		a.add("Apple");
		a.add("Pomegranate");
		a.add("Strawberry");
		a.add("Grapes");
		a.add("Orange");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		Collections.reverse(a);
		Iterator j=a.iterator();
		while(j.hasNext())
		{
			System.out.print(j.next()+" ");
		} 		
	}
}
/*
output:-
----------
Banana Apple Pomegranate Strawberry Grapes Orange 

Orange Grapes Strawberry Pomegranate Apple Banana 
-------------------------------
*/